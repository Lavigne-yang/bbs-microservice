package com.yc.bbs.controller;

import com.yc.bbs.bean.Board;
import com.yc.bbs.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("findAll")
    public List<Board> findAll(){

        return boardService.findAll();
    }
}

