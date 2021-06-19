package com.enfi.exam.domain.answer.entity;

import com.enfi.exam.domain.answer.entity.dp.ExamAnswerItem;
import com.enfi.exam.domain.answer.entity.dp.ExamPaperStatus;
import com.enfi.exam.domain.common.BaseDomain;
import com.enfi.exam.domain.common.dp.ExamTime;
import com.enfi.exam.domain.common.dp.UserId;
import com.enfi.exam.domain.exampaper.entity.ExamPaper;
import lombok.*;

import java.util.List;

import static cn.hutool.core.date.DateTime.now;

/**
 * @author cloud-cc
 * @ClassName ExamPaperAnswer
 * @Description 考试答卷 entity
 * @date 2021/6/10 08:53
 * @Version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExamPaperAnswer extends BaseDomain {

    private Long id;

    /**
     * 答题人员信息
     */
    private UserId userId;

    /**
     * 试卷信息
     */
    private ExamPaper examPaper;

    /**
     * 试题回答
     */
    private List<ExamAnswerItem> answerList;

    /**
     * 答卷状态
     */
    private ExamPaperStatus examPaperStatus;

    /**
     * 答题时间
     */
    private ExamTime examTime;

    /**
     * 选择试卷
     *
     * @param examPaper 试卷ID
     * @return 试卷相关内容
     */
    public ExamPaperAnswer selectExamPaper(ExamPaper examPaper) {
        this.setExamPaper(examPaper);
        return this;
    }

    /**
     * 保存答卷
     *
     * @return 答卷信息
     */
    public ExamPaperAnswer saveExamPaperAnswer(ExamPaperAnswer examPaperAnswer) {
        examPaperAnswer.setCreateDate(now());
        this.setExamPaperStatus(ExamPaperStatus.SAVE);
        return this;
    }

    /**
     * 提交答卷
     *
     * @return 答卷信息
     */
    public ExamPaperAnswer submitExamPaperAnswer(ExamPaperAnswer examPaperAnswer) {
        this.setExamPaperStatus(ExamPaperStatus.SUBMIT);
        return this;
    }
}
