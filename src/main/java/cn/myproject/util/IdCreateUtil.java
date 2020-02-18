package cn.myproject.util;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;

import java.math.BigInteger;
import java.util.Random;

/**
 * @Auther: ymfa
 * @Date: 2020/1/15 12:00
 * @Description:
 */
public class IdCreateUtil {
     public  static long createOnlyId(){
        Random r=new Random();

        return  r.nextLong();
    }


}
