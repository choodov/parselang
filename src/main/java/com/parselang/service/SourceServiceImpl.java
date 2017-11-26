package com.parselang.service;

import com.parselang.entity.SourceText;
import com.parselang.repository.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceServiceImpl implements SourceService{

    private final SourceRepository sourceRepository;

    @Autowired
    public SourceServiceImpl(SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository;
    }

    @Override
    public void save(SourceText sourceText) {
        sourceRepository.save(sourceText);
    }
}
