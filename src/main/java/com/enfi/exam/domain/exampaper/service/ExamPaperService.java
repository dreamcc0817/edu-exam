package com.enfi.exam.domain.exampaper.service;

import com.enfi.exam.domain.exampaper.repository.ExamPaperRepository;
import com.enfi.exam.domain.exampaper.entity.ExamPaper;
import org.springframework.stereotype.Service;

/**
 * @author cloud-cc
 * @ClassName ExamPaperService
 * @Description ExamPaper 领域服务
 * @date 2021/6/7 16:39
 * @Version 1.0
 */
@Service
public class ExamPaperService {

    private final ExamPaperRepository examPaperRepository;

    public ExamPaperService(ExamPaperRepository examPaperRepository) {
        this.examPaperRepository = examPaperRepository;
    }

    /**
     * 保存试卷
     *
     * @param examPaper 试卷
     * @return 保存试卷
     */
    public ExamPaper save(ExamPaper examPaper) {
        examPaper.create();
        examPaperRepository.save(examPaper);
        return examPaper;
    }

    /**
     * 根据ID查询试卷
     *
     * @param examPaperId 试卷ID
     * @return 试卷
     */
    public ExamPaper queryById(Long examPaperId) {
        return examPaperRepository.find(examPaperId);
    }
}
