package cn.myproject.wstl.service;


import cn.myproject.entity.Formmain1119;
import cn.myproject.entity.Formmain1120;
import cn.myproject.entity.Waterfb;
import cn.myproject.mapper.Formmain1120Mapper;
import cn.myproject.service.IWaterfbService;
import cn.myproject.util.ApplicationContextUtil;
import cn.myproject.util.DateUtil;
import cn.myproject.util.IdCreateUtil;
import cn.myproject.util.WaterDto;
import cn.myproject.wstl.common.CharDataWS;
import cn.myproject.wstl.common.IMCWebService;
import cn.myproject.wstl.common.IMCWebService_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.util.unit.DataUnit;

import java.math.BigDecimal;
import java.util.*;

@Configuration
public class PushChargeDataImpl{

    private IWaterfbService iWaterfbService;

    private Formmain1120Mapper formmain1120Mapper;

    public static final HashSet<String> xldSenSet = new HashSet<String>() {{
        add("30001010200100201");
        add("30001016300101500");
        add("30001010200400201");
        add("30001016300100601");
        add("30001016300100602");
        add("30001016300101000");
        add("30001016300151000");
    }};
    //库水位senid列表
    public static final HashSet<Long> kushuiweiSenSet = new HashSet<Long>() {{
        add(30001020200100201L);
        add(30001010200100201L);
    }};
    //蓄水量senid列表
    public static final HashSet<Long> xushuiliangSenSet = new HashSet<Long>() {{
        add(30001016300101500L);
        add(30001026300101500L);
    }};
    //坝下水位senid列表
    public static final HashSet<Long> baxiashuiweiSenSet = new HashSet<Long>() {{
        add(30001020200900201L);
        add(30001010200400201L);
    }};
    //入库流量senid列表
    public static final HashSet<Long> rukuliuliangSenSet = new HashSet<Long>() {{
        add(30001016300100601L);
        add(30001026300100601L);
    }};
    //出库流量senid列表
    public static final HashSet<Long> chukuliuliangSenSet = new HashSet<Long>() {{
        add(30001026300100602L);
        add(30001016300100602L);
    }};
    //弃水量senid列表
    public static final HashSet<Long> qishuiliangSenSet = new HashSet<Long>() {{
        add(30001016300100604L);
        add(30001026300100604L);
    }};

    //报表数据，时间加单位唯一确定一条报表信息
    public static HashMap<String,Formmain1120> baobiaoMap = new HashMap();

    /**
     * 水情电量报表信息
     * @param dto
     * @return
     */
	private Formmain1120 getShuiqingBiaobiao(WaterDto dto){
        List<CharDataWS> charDataWS = getCharDataWS(dto);
        Formmain1120 baobiao = new Formmain1120();

        //设置字段数据
        for (CharDataWS ws: charDataWS) {
            setFileVal(ws,baobiao);
        }
        //设置单位数据
        baobiao.setField0009(dto.getDanwei());
        return baobiao;
    }

    /**
     * 插入水情电量定时任务
     * @param dtolist
     */
    @Transactional
    public void executeShuiQing(List<WaterDto> dtolist) throws Exception{
        if (dtolist.size() == 0)
            return;
        List<Waterfb> waterfbList = new ArrayList<>();

        iWaterfbService = (IWaterfbService) ApplicationContextUtil.getBean("waterfbService");
         for(WaterDto dto: dtolist){
            Waterfb waterfb = getShuiQingLanmu(dto).setField0007(dto.getXuhao()).setField0009(DateUtil.getDate(dto.getStartTime())).setId(IdCreateUtil.createOnlyId());
            if (waterfb.getField0001().equals("昨日发电量（万度）")){

                waterfb.setField0002(null);
            }
            if (!StringUtils.hasText(waterfb.getField0002()) || !StringUtils.hasText(waterfb.getField0003())){
                //if (StringUtils.hasText(DateUtil.getYyyyMmDdDateString(waterfb.getField0009())))
                throw new RuntimeException("小浪底或西霞院"+waterfb.getField0001()+"的值为空");
            }
            waterfbList.add(waterfb);
            //waterfbList.add();
        }
        iWaterfbService.batchInsert(waterfbList);
        //因为id问题暂时放弃批量插入
        //iWaterfbService.batchInsert(waterfbList);

        //报表代码暂时注释
        //formmain1120Mapper = (Formmain1120Mapper) ApplicationContextUtil.getBean("formmain1120Mapper");
        //List<Formmain1120> form1120list = new ArrayList(baobiaoMap.values());
        //for (Formmain1120 formmain1120: form1120list) {
        //    formmain1120Mapper.insert(formmain1120);
        //}
    }

    private Waterfb getShuiQingLanmu(WaterDto dto) {

        Waterfb waterfb = new Waterfb();
        //设置水库列数据
        waterfb.setField0001(dto.getShuiku());

        Boolean sumFlag = false;
        if ("年累计（亿度）".equals(dto.getShuiku())){
            sumFlag = true;
        }

        List<CharDataWS> datas = getCharDataWS(dto);
        for (CharDataWS ws: datas){
            Double v = ws.getV();
            System.out.println("senid是"+ws.getSenid()+", 获取到的值为:"+v);
            String value = v.toString();
            if (sumFlag){
                BigDecimal bg = new BigDecimal(v);
                value = bg.divide(new BigDecimal(10000), 1, BigDecimal.ROUND_DOWN).toString();
            }else{
                value = String.format("%.1f",v);
            }

            String danwei = "";

            if (xldSenSet.contains(Long.toString(ws.getSenid()))){
                //如果是小浪底设置小浪底数据
                waterfb.setField0002(value);
                danwei = "小浪底";
            }else{
                //否则设置西霞院数据
                waterfb.setField0003(value);
                danwei = "西霞院";
            }

            //设置水情报表信息的数据
            String mapKey = DateUtil.getTodayDateString() + danwei;
            Formmain1120 formmain1120 = baobiaoMap.get(mapKey);
            if (formmain1120 == null){
                formmain1120 = new Formmain1120();
                //设置单位时间数据
                //formmain1120.setField0001(DateUtil.getDate(dto.getStartTime()));
                //formmain1120.setField0009(danwei);
            }
            setFileVal(ws,formmain1120);
            baobiaoMap.put(mapKey,formmain1120);

        }

        return waterfb;
    }

    /**
     * 获取水情电量数据
     * @param dto
     * @return
     */
    private List<CharDataWS> getCharDataWS(WaterDto dto) {
        IMCWebService_Service test = new IMCWebService_Service();
        IMCWebService service = test.getIMCWebServicePort();

        return service.getWDSTimeSerialData(dto.getArray(), dto.getStartTime(), ">=", dto.getEndTime(), "<=", dto.getCalType(), "CALC_REAL", dto.getValType(), "oa", "1qaz@WSX").getItem();
    }

    /**
     * 设置字段数据
     */
    private void setFileVal(CharDataWS ws, Formmain1120 baobiao) {

        if (kushuiweiSenSet.contains(ws.getSenid())){
            baobiao.setField0002(ws.getV());
        }
        if (xushuiliangSenSet.contains(ws.getSenid())){
            baobiao.setField0003(ws.getV());
        }
        if (baxiashuiweiSenSet.contains(ws.getSenid())){
            baobiao.setField0004(ws.getV());
        }
        if (rukuliuliangSenSet.contains(ws.getSenid())){
            baobiao.setField0005(ws.getV());
        }
        if (chukuliuliangSenSet.contains(ws.getSenid())){
            baobiao.setField0006(ws.getV());
        }

        if (qishuiliangSenSet.contains(ws.getSenid())){
            baobiao.setField0007(ws.getV());
        }

    }
}
