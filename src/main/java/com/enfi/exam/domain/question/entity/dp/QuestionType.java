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
    SINGLECHOICE(1, "单选题"),
    /**
     * 多选题
     */
    MULTIPLECHOICE(2, "多选题"),
    /**
     * 判断题
     */
    TRUEORFALSE(3, "判断题"),
    /**
     * 填空题
     */
    GAPFILLING(4, "填空题"),
    /**
     * 简答题
     */
    SHORTANSWER(5, "简答题");

    Integer code;
    String name;

    QuestionType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static QuestionType convert(Integer code) {
        switch (code) {
            case 1:
                return SINGLECHOICE;
            case 2:
                return MULTIPLECHOICE;
            case 3:
                return TRUEORFALSE;
            case 4:
                return GAPFILLING;
            case 5:
                return SHORTANSWER;
            default: {
                return null;
            }
        }
    }

}
