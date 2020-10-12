package com.yc.bbs.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_topic")
public class Topic {
    @Id
    private Integer topicid;
    private String title;
    private String content;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishtime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date modifytime;
    private Integer uid;
    private Integer boardid;
}
