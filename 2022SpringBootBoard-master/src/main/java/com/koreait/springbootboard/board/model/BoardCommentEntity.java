package com.koreait.springbootboard.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardCommentEntity {
    private int icmt;
    private int iboard;
    private int iuser;
    private String ctnt;
    private String rdt;
    private String mdt;
}
