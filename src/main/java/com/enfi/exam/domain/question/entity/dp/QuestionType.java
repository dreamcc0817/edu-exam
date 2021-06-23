package com.enfi.exam.domain.question.entity.dp;

import lombok.Getter;

/**
 * @author cloud-cc
 * @ClassName QuestionType
 * @Description 问题类型
 * @date 2021/5/22 10:20
 * @Version 1.0
 */
@Getter
public enum QuestionType {
    /**
     * 单选题
     */
    SINGLE_CHOICE
    /**
     * 多选题
     */
    ,MULTIPLE_CHOICE
    /**
     * 判断题
     */
    ,TRUE_OR_FALSE
    /**
     * 填空题
     */
    ,GAP_FILLING
    /**
     * 简答题
     */
    ,SHORT_ANSWER


}
