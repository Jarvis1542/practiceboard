package com.practice.board.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class ReplyListDTO {
    private Long rno;
    private Long bno;
    private String rcontent;
    private String rwriter;
    private Date rregDate;
}
