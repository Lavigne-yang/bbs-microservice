package com.yc.bbs.bean;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_board")
@Data
public class Board {

    @Id
    private Integer boardid;
    private String boardname;
    private Integer parentid;
}
