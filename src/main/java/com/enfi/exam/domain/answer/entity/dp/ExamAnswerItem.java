package com.enfi.exam.domain.answer.entity.dp;

import com.enfi.exam.domain.question.entity.Question;
import lombok.Data;

import java.util.List;

/**
 * @author cloud-cc
 * @ClassName ExamAnswer
 * @Description 考试答题
 * @date 2021/6/16 09:58
 * @Version 1.0
 */
@Data
public class ExamAnswerItem {
    /**
     * 问题
     */
    private Question questionId;
    /**
     * 答题内容
     */
    private List<String> content;
}
