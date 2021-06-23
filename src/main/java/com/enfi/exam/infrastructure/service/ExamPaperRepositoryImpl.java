package com.enfi.exam.infrastructure.service;

import com.enfi.exam.domain.exampaper.entity.ExamPaper;
import com.enfi.exam.domain.exampaper.repository.ExamPaperRepository;
import org.springframework.stereotype.Service;

/**
 * @author cloud-cc
 * @ClassName ExamPaperRepositoryImpl
 * @Description ExamPaper repository orm 实现类
 * @date 2021/6/7 16:42
 * @Version 1.0
 */
@Service
public class ExamPaperRepositoryImpl implements ExamPaperRepository {

    @Override
    public void save(ExamPaper examPaper) {

    }

    @Override
    public ExamPaper find(Long examPaperId) {
        return null;
    }
}
