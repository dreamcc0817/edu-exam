package com.enfi.exam.domain.exampaper.entity.dp;

/**
 * @author cloud-cc
 * @ClassName ExamType
 * @Description 考试类型
 * @date 2021/5/21 15:21
 * @Version 1.0
 */
public enum ExamType {
    /**
     * 固定试卷
     */
    Fixed(1, "固定试卷"),
    /**
     * 时段试卷
     */
    TimeLimit(4, "时段试卷"),
    /**
     * 任务试卷
     */
    Task(6, "任务试卷");

    Integer code;
    String name;

    ExamType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ExamType convert(Integer code) {
        switch (code) {
            case 1:
                return Fixed;
            case 2:
                return TimeLimit;
            case 3:
                return Task;
            default: {
                return null;
            }
        }
    }
}
