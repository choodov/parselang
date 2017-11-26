package com.parselang.repository;


import com.parselang.entity.SourceText;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepository extends JpaRepository<SourceText, String>{
}
