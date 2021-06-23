package com.enfi.exam.domain.exampaper.repository;

import com.enfi.exam.domain.exampaper.entity.ExamPaper;

/**
 * @author cloud-cc
 * @ClassName ExamPaperRepository
 * @Description 试卷
 * @date 2021/5/22 13:45
 * @Version 1.0
 */
public interface ExamPaperRepository {

    /**
     * 保存试卷
     *
     * @param examPaper 试卷
     */
    void save(ExamPaper examPaper);

    /**
     * 根据试卷ID查找试卷
     *
     * @param examPaperId 试卷ID
     * @return 试卷信息
     */
    ExamPaper find(Long examPaperId);

}
