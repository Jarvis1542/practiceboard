package com.practice.board.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class BoardListDTO {
    private Long bno;
    private String title;
    private String writer;
    private Date regDate;
    private int count;
}