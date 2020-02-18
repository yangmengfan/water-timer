package cn.myproject;


import cn.myproject.timer.ShuiQingTask;
import cn.myproject.util.ExcelUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


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

}
