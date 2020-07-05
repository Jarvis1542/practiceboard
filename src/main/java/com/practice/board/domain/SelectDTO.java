package com.practice.board.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class SelectDTO {
    private Long bno;
    private String title;
    private String content;
    private String writer;
    private int count;
    private LocalDateTime regDate;
}
