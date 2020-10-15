package com.yc.bbs.service;

import com.yc.bbs.bean.Reply;
import com.yc.bbs.dao.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired(required = false)
    private ReplyMapper replyMapper;


    @Override
    public List<Reply> findAll() {
        return replyMapper.selectAll();
    }
}
