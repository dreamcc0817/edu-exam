package com.enfi.exam.domain.question.entity.dp;

import lombok.Getter;

/**
 * @author cloud-cc
 * @ClassName FrameTextContent
 * @Description 试卷内容
 * @date 2021/5/22 08:50
 * @Version 1.0
 */
public class FrameTextContent {

    /**
     * 内容(Json)
     */
    @Getter
    private String content;

    public FrameTextContent(String content) {
        this.content = content;
    }
}
