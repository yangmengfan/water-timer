package cn.myproject.entity;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import java.util.Date;

    import cn.myproject.common.BaseEntity;
    import com.baomidou.mybatisplus.annotation.TableField;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 水情报表信息表
    * </p>
*
* @author yangmf
* @since 2020-01-14
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @TableName("FORMMAIN_1120")
    public class Formmain1120 extends BaseEntity {

    private static final Long serialVersionUID = 1L;

            @TableId("ID")
    private Long id;

        @TableField("STATE")
    private Long state;

        @TableField("START_MEMBER_ID")
    private String startMemberId;

        @TableField("START_DATE")
    private LocalDateTime startDate;

        @TableField("APPROVE_MEMBER_ID")
    private String approveMemberId;

        @TableField("APPROVE_DATE")
    private LocalDateTime approveDate;

        @TableField("FINISHEDFLAG")
    private Long finishedflag;

        @TableField("RATIFYFLAG")
    private Long ratifyflag;

        @TableField("RATIFY_MEMBER_ID")
    private String ratifyMemberId;

        @TableField("RATIFY_DATE")
    private LocalDateTime ratifyDate;

        @TableField("SORT")
    private Long sort;

        @TableField("MODIFY_MEMBER_ID")
    private String modifyMemberId;

        @TableField("MODIFY_DATE")
    private LocalDateTime modifyDate;
//时间
        @TableField("FIELD0001")
    private String field0001;
    //所属单位
        @TableField("FIELD0009")
    private String field0009;
    //库水位
        @TableField("FIELD0002")
    private Double field0002;
    //蓄水量
        @TableField("FIELD0003")
    private Double field0003;
    //坝下水位
        @TableField("FIELD0004")
    private Double field0004;
    //昨日入库流量
        @TableField("FIELD0005")
    private Double field0005;
    //昨日出库流量
        @TableField("FIELD0006")
    private Double field0006;
    //弃水流量
        @TableField("FIELD0007")
    private Double field0007;


}
