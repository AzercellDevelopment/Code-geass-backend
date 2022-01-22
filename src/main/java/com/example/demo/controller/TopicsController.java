package com.example.demo.controller;

import com.example.demo.service.TopicsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TopicsController {

    private final TopicsService topicsService;

    @GetMapping("topics")
    public Object getTopics() {
        Object res = this.topicsService.getTopics();

        return res;
    }
}
