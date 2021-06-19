package com.enfi.exam.application.dto;

import com.enfi.exam.domain.answer.entity.dp.ExamAnswerItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author cloud-cc
 * @ClassName AnswerDto
 * @Description 答卷dto
 * @date 2021/6/17 15:13
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDto {

    private Long id;

    /**
     * 开始做题时间
     */
    private Date startTime;

    /**
     * 试题提交时间
     */
    private Date endTime;

    /**
     * 试卷回答
     */
    private List<ExamAnswerItem> questionAnswerList;
}
