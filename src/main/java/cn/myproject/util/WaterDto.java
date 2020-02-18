package cn.myproject.util;

import cn.myproject.wstl.array.LongArray;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ymfa
 * @Date: 2020/1/8 18:22
 * @Description:
 */
@Data
@Accessors(chain = true)
public class WaterDto  {
    private  String startTime; //开始时间 格式 yyyy-MM-dd hh:mmss
    private  String endTime; //结束时间
    private  String valType; //测值类型
    private String calType; //取值范围
    private  String filed; //字段名称
    private List<QueryDto> dtoList = new ArrayList<>();
    private LongArray array = new LongArray();
    private String shuiku;
    private String danwei;

    private Integer xuhao;
}
