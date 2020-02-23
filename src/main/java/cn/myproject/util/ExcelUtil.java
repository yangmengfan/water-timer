package cn.myproject.util;

import jxl.*;
import jxl.read.biff.BiffException;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

@ConfigurationProperties(prefix = "job")
@Component
public class ExcelUtil {
    static String excelPosition;
    /*
     * sh: Excel文件中的sheet
     */
    public static Sheet getSheet()  {
        String[] result;
        //Test1.xls 为你放在java项目下的文件名
        Workbook book = null;
        try {

            book = Workbook.getWorkbook(new File(excelPosition));
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

    public String getExcelPosition() {
        return excelPosition;
    }

    public void setExcelPosition(String excelPosition) {
        this.excelPosition = excelPosition;
    }
}