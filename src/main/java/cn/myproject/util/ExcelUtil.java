package cn.myproject.util;

import jxl.*;
import jxl.read.biff.BiffException;
import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class ExcelUtil {
    /*
     * sh: Excel文件中的sheet
     */
    public static Sheet getSheet()  {
        String[] result;
        //Test1.xls 为你放在java项目下的文件名
        Workbook book = null;
        try {
            ///opt/Seeyon/watertime/xldxixiayuan.xls
            //E:/workproject/water-timer/src/main/resources/xldxixiayuan.xls
            book = Workbook.getWorkbook(new File("E:/workproject/water-timer/src/main/resources/xldxixiayuan.xls"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        //获得excel文件的sheet表
        Sheet sheet = book.getSheet("Sheet1");

        int rows = sheet.getRows();//行
        int cols = sheet.getColumns();//列

        System.out.println("总列数：" + cols);
        System.out.println("总行数:" + rows);
        System.out.println("----------------------------");
        result = new String[rows];
        int i=0;
        //循环读取数据
        for(i=1;i<rows;i++)
        {
            //getCell(x,y)   第y行的第x列
            result[i] = new String(sheet.getCell(0,0).getContents());
        }
        return  sheet;
    }

    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    }

}