package cn.myproject.entity;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import cn.myproject.common.BaseEntity;
    import com.baomidou.mybatisplus.annotation.TableField;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 定时任务表，记录执行成功或者失败的定时任务
    * </p>
*
* @author yangmf
* @since 2020-01-10
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @TableName("FORMMAIN_1119")
    public class Formmain1119 extends BaseEntity {

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

        @TableField("FIELD0001")
    private String field0001;

        @TableField("FIELD0002")
    private String field0002;

        @TableField("FIELD0003")
    private String field0003;


}
