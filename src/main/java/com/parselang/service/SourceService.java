package com.parselang.service;

import com.parselang.entity.Source;

public interface SourceService {

    void save(Source source);

    Source findByName(String name);
}
