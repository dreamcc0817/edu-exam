package com.enfi.exam.domain.question.entity.dp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author cloud-cc
 * @ClassName QuestionInfo
 * @Description 问题信息
 * @date 2021/6/2 15:01
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionInfo {

    /**
     * 问题前缀
     */
    @NotNull
    private String prefix;

    /**
     * 问题内容
     */
    @NotNull
    private String content;

    /**
     * 分数
     */
    private Double score;
}
