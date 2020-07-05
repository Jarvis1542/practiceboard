package com.practice.board.mapper;

import com.practice.board.domain.*;

import java.util.ArrayList;

public interface ReplyMapper {
    void insertReply(ReplyDTO replyDTO);
    ArrayList<ReplyListDTO> replyList(Long bno);
}
