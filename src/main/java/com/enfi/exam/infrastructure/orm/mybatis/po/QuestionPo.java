package com.enfi.exam.infrastructure.orm.mybatis.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author cloud-cc
 * @ClassName QuestionPO
 * @Description QuestionPO
 * @date 2021/5/25 15:35
 * @Version 1.0
 */
@Data
@TableName(value = "t_question")
public class QuestionPo {

    @TableId(value = "id")
    private Long id;

    /**
     * 1.单选题 2.多选题 3.判断题 4.填空题 5.简答题
     */
    private Integer questionType;

    /**
     * 学科
     */
    private String subjectType;

    /**
     * 题目总分(千分制)
     */
    private Integer score;

    /**
     * 题目难度
     */
    private Integer difficult;

    /**
     * 正确答案
     */
    private String correct;

    /**
     * 题目 填空、 题干、解析、答案等信息
     */
    private String infoTextContent;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 删除标志
     */
    @TableLogic
    private Boolean deleted;

}
