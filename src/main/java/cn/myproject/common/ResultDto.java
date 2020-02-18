package cn.myproject.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: ymfa
 * @Date: 2019/6/5 17:39
 * @Description:
 */
public class ResultDto<T> implements Serializable {
    private Integer total;
    private List<T> rows;
    private Object data;
    private String message;
    private Boolean success;
    private Map map = new HashMap();
    public static ResultDto errorDto = new ResultDto(false);


    public ResultDto (Boolean res){
        this.success = res;
        if(res == true){
            this.message = "操作成功";
        }else{
            this.message = "操作失败";
        }
    }
    public static ResultDto dataInstance(Object obj){
        ResultDto dto;
        if(obj == null){
            dto = error("获取数据失败");
        }else{
            dto = success("获取数据成功");
            dto.setData(obj);
        }
        return dto;
    }
    public static ResultDto success(String message){
        ResultDto dto = new ResultDto();
        dto.setMessage(message);
        return dto;
    }
    public static ResultDto error(String message){
        errorDto.setMessage(message);
        return errorDto;
    }

    public String getMessage() {
        return message;
    }

    public ResultDto setMessage(String message) {
        this.message = message;
        return this;
    }

    public ResultDto(Integer total, List<T> rows) {
        this.total = total;
        if (rows == null) {
            rows = new ArrayList();
        }

        this.rows = rows;
    }

    public ResultDto() {
        this.total = 0;
        this.setRows(new ArrayList());
    }

    public ResultDto(List<T> list) {
        if (list == null) {
            this.total = 0;
            this.setRows(new ArrayList());
        } else {
            this.setRows(list);
            this.total = list.size();
        }

    }

    public Integer getTotal() {
        return this.total;
    }

    public ResultDto<T> setTotal(Integer total) {
        if (total != null) {
            this.total = total;
        } else {
            this.total = 0;
        }
        return this;
    }

    public List<T> getRows() {
        return this.rows;
    }

    public ResultDto<T> setRows(List<T> rows) {
        this.rows = rows;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Object getData() {
        return data;
    }

    public ResultDto setData(Object data) {
        this.data = data;
        return this;
    }
}
