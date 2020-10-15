package com.yc.bbs.controller;

import com.yc.bbs.bean.Reply;
import com.yc.bbs.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("reply")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    @GetMapping("findAll")
    public List<Reply> findAll(){

        return replyService.findAll();
    }
}

