package cn.myproject.util;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Auther: ymfa
 * @Date: 2020/1/9 15:41
 * @Description:
 */
@Data
@Accessors(chain = true)
public class QueryDto {
    String senid;
    String filed;
    String valtype;
    String danwei;


}
