package com.parselang.repository;


import com.parselang.entity.Source;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepository extends JpaRepository<Source, String> {

    Source findByName(String name);
}
