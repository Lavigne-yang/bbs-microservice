package com.yc.bbs.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_user")
@Data
public class User {

    @Id
    private Integer uid;
    private String uname;
    private String upass;
    private String head;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date regtime;
    private Integer gender;
}
