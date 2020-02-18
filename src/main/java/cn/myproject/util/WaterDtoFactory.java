package cn.myproject.util;

import jxl.Sheet;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ymfa
 * @Date: 2020/1/9 15:23
 * @Description:
 */
public class WaterDtoFactory {

    public static List<WaterDto> getExcelShuiqing(String date){

        List<WaterDto> list = new ArrayList<>();

        Sheet sheet = ExcelUtil.getSheet();
        int columns = sheet.getColumns();

        int rows = sheet.getRows();
        //i表示行，j表示列
        for (int i=1; i<rows; i++){
            WaterDto dto = new WaterDto();
            dto.setStartTime(date+" 00:00:00");
            dto.setEndTime(date+" 08:00:00");
            //设置第4列为测值类型
            dto.setValType(sheet.getCell(3,i).getContents());
            //设置第5列为取值范围
            dto.setCalType(sheet.getCell(4,i).getContents());
            dto.setShuiku(sheet.getCell(0,i).getContents());
            dto.setXuhao(i);
            List<Long> longArray = dto.getArray().getItem();


            for (int j=1; j<columns-2; j++) {
                //获取senid
                String contents = sheet.getCell(j, i).getContents();
                longArray.add(Long.parseLong(contents));
            }
            list.add(dto);
        }
        return list;
    }

}
