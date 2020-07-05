package com.practice.board.service;

import com.practice.board.domain.*;
import com.practice.board.mapper.BoardMapper;
import com.practice.board.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {
    @Autowired(required = false)
    BoardMapper boardMapper;
    @Autowired(required = false)
    ReplyMapper replyMapper;

    public void insert(InsertDTO insertDTO){
        boardMapper.insert(insertDTO);
    }

    public ArrayList<BoardListDTO> boardList(){
        return boardMapper.boardList();
    }

    public SelectDTO select(Long bno){
        return boardMapper.select(bno);
    }

    public void count(Long bno){
        boardMapper.count(bno);
    }

    public void update(UpdateDTO updateDTO){
        boardMapper.update(updateDTO);
    }

    public void delete(Long bno){
        boardMapper.delete(bno);
    }

    public void insertReply(ReplyDTO replyDTO){
        replyMapper.insertReply(replyDTO);
    }

    public ArrayList<ReplyListDTO> replyList(Long bno){
        return replyMapper.replyList(bno);
    }
}
