package com.parselang.service;

import com.parselang.entity.Source;
import com.parselang.entity.Word;
import com.parselang.repository.WordRepository;
import com.parselang.web.dto.WordDto;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;
    private final SourceService sourceService;

    public WordServiceImpl(WordRepository wordRepository, SourceService sourceService) {
        this.wordRepository = wordRepository;
        this.sourceService = sourceService;
    }

    @Override
    public void save(WordDto wordDto) {
        wordRepository.save(wordDto(wordDto));
    }

    private Word wordDto(WordDto wordDto) {
        Source source = sourceService.findByName(wordDto.getSourceName());
        Word word = new Word();
        word.setWord(wordDto.getWord());
        word.setCount(wordDto.getCount());
        word.setSource(source);
        return word;
    }
}