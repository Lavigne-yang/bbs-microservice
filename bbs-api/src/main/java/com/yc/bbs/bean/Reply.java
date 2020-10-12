package com.yc.bbs.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_reply")
@Data
public class Reply {

    @Id
    private Integer replyid;
    private String title;
    private String content;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishtime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date modifytime;
    private Integer uid;
    private Integer topicid;
}
