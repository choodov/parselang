package com.parselang.repository;

import com.parselang.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, String> {
}
