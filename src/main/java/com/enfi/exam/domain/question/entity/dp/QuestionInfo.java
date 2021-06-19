package com.enfi.exam.domain.question.entity.dp;

import lombok.Data;

/**
 * @author cloud-cc
 * @ClassName QuestionInfo
 * @Description 问题信息
 * @date 2021/6/2 15:01
 * @Version 1.0
 */
@Data
public class QuestionInfo {

    /**
     * 题目信息
     */
    private String contentText;

    /**
     * 问题前缀
     */
    private String prefix;

    /**
     * 问题内容
     */
    private String content;

    /**
     * 分数
     */
    private Integer score;
}
