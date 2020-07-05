package com.practice.board.domain;

import lombok.Data;

@Data
public class ReplyDTO {
    private Long rno;
    private Long bno;
    private String rcontent;
    private String rwriter;
}
