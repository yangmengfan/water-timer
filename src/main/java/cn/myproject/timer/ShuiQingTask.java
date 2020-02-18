package cn.myproject.timer;

import cn.myproject.entity.Formmain1119;
import cn.myproject.entity.Waterfb;
import cn.myproject.service.IFormmain1119Service;
import cn.myproject.service.IWaterfbService;
import cn.myproject.util.ApplicationContextUtil;
import cn.myproject.util.DateUtil;
import cn.myproject.util.WaterDto;
import cn.myproject.util.WaterDtoFactory;
import cn.myproject.wstl.service.PushChargeDataImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * @Auther: ymfa
 * @Date: 2020/1/17 15:11
 * @Description:
 */
@Configuration
public class ShuiQingTask {
    @Autowired
    private IFormmain1119Service iFormmain1119Service;


    @Scheduled(cron = "${job.cron}")
    public void executeShuiQingTask(){
        PushChargeDataImpl service = new PushChargeDataImpl();
        System.out.println("水情栏目定时任务开始执行:"+ new Date());
        //false代表今天未执行任务，true代表执行
        Boolean updateFlag = false;
        Boolean executFlag = false;
        Integer count = 0; //失败重试次数
        Formmain1119 form = new Formmain1119();
        form.setField0001("水情电量");
        //0代表未执行 1代表已执行
        try {
            List<WaterDto> dtolist = new ArrayList<>();

            //置空状态字段，查看今天是否执行任务
            form.setField0002(DateUtil.getTodayDateString());
            List<Formmain1119> formmain1119s = iFormmain1119Service.queryPage(form);
             //如果当日没有执行过该任务，则执行
            if (formmain1119s.size() > 0){
                //如果当日执行过任务且执行失败，则重新执行
                Formmain1119 formmain1119 = formmain1119s.get(0);
                if ("0".equals(formmain1119.getField0003())){
                    dtolist.addAll(WaterDtoFactory.getExcelShuiqing(DateUtil.getTodayDateString()));
                    updateFlag = true;
                }
            } else if(formmain1119s.size() == 0){
                dtolist.addAll(WaterDtoFactory.getExcelShuiqing(DateUtil.getTodayDateString()));
                executFlag = true;
            }

            service.executeShuiQing(dtolist);

            if (executFlag){
                form.setField0003("1");
                form.setField0002(DateUtil.getTodayDateString());
                iFormmain1119Service.save(form);
            }

            // 更新执行成功的定时任务
            if (updateFlag){
                Formmain1119 formmain1119 = formmain1119s.get(0);
                formmain1119.setField0003("1");

                iFormmain1119Service.updateById(formmain1119);
            }

            //取消显示栏目错误数据
            updateErrorShow(DateUtil.getPassDate());

            System.out.println("水情栏目定时任务执行结束: " + new Date());
        } catch (Exception e) {
            e.printStackTrace();
            form.setField0003("0");
            Calendar calendar = Calendar.getInstance();

            if (executFlag && calendar.get(Calendar.HOUR_OF_DAY) > 10){
                iFormmain1119Service.save(form);
                updateErrorShow(new Date());
            }
        }
    }

    private void updateErrorShow(Date date) {
        try {
            IWaterfbService iWaterfbService = (IWaterfbService) ApplicationContextUtil.getBean("waterfbService");
            Waterfb water = new Waterfb();
            water.setField0009(date);
            QueryWrapper<Waterfb> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("field0005",1);
            iWaterfbService.update(water,queryWrapper);
        }catch (Exception exception){
            System.out.println("更新错误数据时出现异常-----");
            exception.printStackTrace();
            System.out.println("-------------------------------");
        }

    }
}
