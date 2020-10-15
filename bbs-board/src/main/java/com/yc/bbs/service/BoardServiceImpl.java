package com.yc.bbs.service;

import com.yc.bbs.bean.Board;
import com.yc.bbs.dao.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired(required = false)
    private BoardMapper boardMapper;


    @Override
    public List<Board> findAll() {
        return boardMapper.selectAll();
    }
}
