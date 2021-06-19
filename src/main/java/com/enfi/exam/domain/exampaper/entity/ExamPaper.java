package com.enfi.exam.domain.exampaper.entity;


import com.enfi.exam.domain.common.dp.ExamTime;
import com.enfi.exam.domain.common.dp.Score;
import com.enfi.exam.domain.common.dp.SubjectType;
import com.enfi.exam.domain.exampaper.entity.dp.ExamPaperId;
import com.enfi.exam.domain.exampaper.entity.dp.ExamPaperTitle;
import com.enfi.exam.domain.exampaper.entity.dp.ExamType;
import com.enfi.exam.domain.question.entity.Question;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cloud-cc
 * @ClassName ExamPaper
 * @Description 试卷
 * @date 2021/5/21 14:21
 * @Version 1.0
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamPaper {
    /**
     * 试卷ID
     */
    private ExamPaperId examPaperId;

    /**
     * 试卷名称
     */
    private ExamPaperTitle examPaperTitle;

    /**
     * 试卷科目
     */
    private SubjectType subjectType;

    /**
     * 考试类型
     */
    private ExamType examType;

    /**
     * 试卷分数
     */
    private Score score;

    /**
     * 考试时间
     */
    private ExamTime examTime;

    /**
     * 试卷内容（试题）
     */
    private List<Question> questionList;


    /**
     * 创建试卷
     *
     */
    public void create() {
        this.examPaperId = new ExamPaperId();
    }

    /**
     * 选择试卷内容
     *
     * @param question 问题
     * @return 试卷
     */
    public ExamPaper selectQuestion(Question question) {
        if (questionList == null) {
            questionList = new ArrayList<>();
        }
        this.questionList.add(question);
        return this;
    }
}
