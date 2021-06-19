package com.enfi.exam.domain.exampaper.entity.dp;

import lombok.Data;

/**
 * @author cloud-cc
 * @ClassName ExamPaperTitle
 * @Description 试卷名称
 * @date 2021/6/7 16:25
 * @Version 1.0
 */
@Data
public class ExamPaperTitle {

    /**
     * 试卷名称
     */
    private String name;

    public ExamPaperTitle(String name) {
        this.name = name;
    }
}
