package com.parselang.web;

import com.parselang.entity.SourceText;
import com.parselang.service.SourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RESTController {

    private final SourceService sourceService;

    @Autowired
    public RESTController(SourceService sourceService) {
        this.sourceService = sourceService;
    }

    @RequestMapping(value = "/source", method = RequestMethod.POST)
    public void postText(@RequestBody SourceText sourceText) {
        sourceService.save(sourceText);
    }

}
