package com.enfi.exam.domain.question.entity.dp;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cloud-cc
 * @ClassName Correct
 * @Description 正确答案
 * @date 2021/5/22 10:30
 * @Version 1.0
 */
public class Correct {

    /**
     * 正确答案
     */
    @Getter
    @Setter
    private String correct;

    public Correct(String correct) {
        this.correct = correct;
    }

    /**
     * 将多选题答案List转换为String
     *
     * @param correctArrays 多选题答案
     */
    public Correct(List<String> correctArrays) {
        this.correct = correctArrays.stream().sorted().collect(Collectors.joining(","));
    }

    /**
     * 获取多选题答案
     *
     * @return 多选题答案
     */
    public List<String> getCorrectArrays() {
        return Arrays.asList(this.correct.split(","));
    }
}
