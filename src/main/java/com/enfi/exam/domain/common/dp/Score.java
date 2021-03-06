package com.enfi.exam.domain.common.dp;

import lombok.Data;

import javax.validation.ValidationException;

/**
 * @author cloud-cc
 * @ClassName Score
 * @Description 分数
 * @date 2021/5/21 15:23
 * @Version 1.0
 */
@Data
public class Score {
    /**
     * 满分（千分制）
     */
    private static final Integer GROSS_SCORE = 1000;

    /**
     * 总分数
     */
    private Double grossScore;

    /**
     * 实际得分
     */
    private Double actualScore;

    /**
     * 总分数
     * @param grossScore 总分数
     */
    public Score(Double grossScore) {
        if(grossScore == null){
            throw new ValidationException("grossSocre不能为空");
        }else if(grossScore > GROSS_SCORE || grossScore < 0){
            throw new ValidationException("grossSocre设置错误");
        }
        this.grossScore = grossScore;
    }

    /**
     * 总分数与实际得分
     * @param grossScore 总分数
     * @param actualScore 实际得分
     */
    public Score(Double grossScore, Double actualScore) {
        if(grossScore == null){
            throw new ValidationException("grossSocre不能为空");
        }else if(grossScore < actualScore || actualScore < 0){
            throw new ValidationException("actualScore设置错误");
        }
        this.grossScore = grossScore;
        this.actualScore = actualScore;
    }

}
