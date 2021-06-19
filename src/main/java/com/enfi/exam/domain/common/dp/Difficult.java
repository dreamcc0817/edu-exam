package com.enfi.exam.domain.common.dp;

/**
 * @author cloud-cc
 * @ClassName Difficult
 * @Description 考试难度
 * @date 2021/5/22 10:30
 * @Version 1.0
 */
public enum Difficult {
    /**
     * 一星
     */
    ONE_STAR(1, "一星"),
    /**
     * 二星
     */

    TWO_STAR(2, "二星"),
    /**
     * 三星
     */
    THREE_STAR(3, "三星"),
    /**
     * 四星
     */
    FOUR_STAR(4, "四星"),
    /**
     * 五星
     */
    FIVE_STAR(5, "五星");

    Integer code;
    String desc;

    Difficult(Integer code,String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static Difficult convert(Integer code) {
        switch (code) {
            case 1:
                return ONE_STAR;
            case 2:
                return TWO_STAR;
            case 3:
                return THREE_STAR;
            case 4:
                return FOUR_STAR;
            case 5:
                return FIVE_STAR;
            default:
                return null;
        }
    }
}
