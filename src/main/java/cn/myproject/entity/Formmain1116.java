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
    * 水清电量
    * </p>
*
* @author yangmf
* @since 2020-01-15
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @TableName("FORMMAIN_1116")
    public class Formmain1116 extends BaseEntity {

    private static final long serialVersionUID = 1L;

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
    /**
     * 水库
     */
        @TableField("FIELD0001")
    private String field0001;
    /**
     * 小浪底
     */
        @TableField("FIELD0002")
    private String field0002;
    /**
     * 西霞院
     */
        @TableField("FIELD0003")
    private String field0003;

    /**
     * 时间 (弃用)
     */
    @TableField("FIELD0005")
    private String field0005;

    /**
     * 日期
     */
    @TableField("FIELD0009")
    private Date field0009;
}
