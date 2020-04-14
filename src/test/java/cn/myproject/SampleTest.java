package cn.myproject;


import cn.myproject.timer.ShuiQingTask;
import cn.myproject.util.ExcelUtil;
import cn.myproject.util.WaterDto;
import cn.myproject.wstl.array.LongArray;
import cn.myproject.wstl.common.CharDataWS;
import cn.myproject.wstl.common.IMCWebService;
import cn.myproject.wstl.common.IMCWebService_Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @Auther: ymfa
 * @Date: 2019/5/22 18:16
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    private ShuiQingTask shuiQingTask;

    @Test
    public void testSelect() {
        shuiQingTask.executeShuiQingTask();
        //ExcelUtil.getSheet();
    }
    @Test
    public void getCharDataWS() {
        IMCWebService_Service test = new IMCWebService_Service();
        IMCWebService service = test.getIMCWebServicePort();
         LongArray array = new LongArray();
        array.getItem().add(30001010200100201L);
        List<CharDataWS> item = service.getWDSTimeSerialData(array, "2020-03-24 00:00:00", ">=", "2020-03-24 08:00:00", "<=", "RUN_HOUR", "CALC_REAL", "V", "oa", "1qaz@WSX").getItem();

        for(CharDataWS ws: item){
            System.out.println(ws.getV());
        }
    }
}
