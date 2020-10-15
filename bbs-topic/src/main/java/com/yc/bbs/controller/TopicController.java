package com.yc.bbs.controller;

import com.yc.bbs.bean.Topic;
import com.yc.bbs.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("topic")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("findAll")
    public List<Topic> findAll(){
        return topicService.findAll();
    }
}

