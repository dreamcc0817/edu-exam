package com.enfi.exam.domain.exampaper.entity.dp;

import lombok.Data;

/**
 * @author cloud-cc
 * @ClassName QuestionCount
 * @Description 题目数量
 * @date 2021/5/22 16:15
 * @Version 1.0
 */
@Data
public class QuestionCountItem {

    /**
     * 问题类型
     */
    private String questionType;

    /**
     * 问题数量
     */
    private Integer questionCount;

}
