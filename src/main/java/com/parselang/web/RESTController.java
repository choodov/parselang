package com.parselang.web;

import com.parselang.entity.Source;
import com.parselang.service.SourceService;
import com.parselang.service.WordService;
import com.parselang.web.dto.WordDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class RESTController {

    private final SourceService sourceService;
    private final WordService wordService;

    @Autowired
    public RESTController(SourceService sourceService, WordService wordService) {
        this.sourceService = sourceService;
        this.wordService = wordService;
    }

    @RequestMapping(value = "/source", method = RequestMethod.POST)
    public void postText(@RequestBody Source source) {
        sourceService.save(source);
    }

    @RequestMapping(value = "/word", method = RequestMethod.POST)
    public void postText(@RequestBody WordDto wordDto) {
        wordService.save(wordDto);
    }
}
