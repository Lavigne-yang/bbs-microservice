package com.yc.bbs.topic.service;

import com.yc.bbs.bean.Topic;
import com.yc.bbs.topic.dao.TopicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService{

    @Autowired(required = false)
    private TopicMapper topicMapper;

    @Override
    public List<Topic> findAll() {
        return topicMapper.selectAll();
    }
}
