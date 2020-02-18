package cn.myproject.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther: ymfa
 * @Date: 2020/1/10 14:51
 * @Description:
 */
public class DateUtil {

    public static String getTodayDateString(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return "2020-02-15";
    }

    public static String getYyyyMmDdDateString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.format(date);
    }

    public static Date getDate(String date) throws Exception{
        int i = date.indexOf(" ");
        String time = date.substring(0, i);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         Date parse = null;

         parse = sdf.parse(time);

        return parse;
    }

    public static Date getPassDate(){

        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.YEAR,-100);
        Date d=cal.getTime();


        SimpleDateFormat sp=new SimpleDateFormat("yyyy-MM-dd");
         return d;
    }

    public static void main(String[] args) {
        //System.out.println(getDate("2018-10-01 00:00:00"));
    }
}
