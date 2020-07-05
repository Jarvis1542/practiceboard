package com.practice.board.controller;

import com.practice.board.domain.*;
import com.practice.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexRestController {
    @Autowired
    BoardService boardService;

    @PostMapping("/rest/write")
    public void insert(InsertDTO insertDTO){
        System.out.println("insert : " + insertDTO.toString());
        boardService.insert(insertDTO);
    }

    @PutMapping("/rest/update")
    public void update(UpdateDTO updateDTO){
        System.out.println("update : " + updateDTO.toString());
        boardService.update(updateDTO);
    }

    @DeleteMapping("/rest/delete")
    public void delete(DeleteDTO deleteDTO){
        System.out.println("delete : " + deleteDTO.toString());
        boardService.delete(deleteDTO.getBno());
    }

    @PostMapping("/rest/reply/insert")
    public void insertReply(ReplyDTO replyDTO){
        System.out.println("reply : " + replyDTO.toString());
        boardService.insertReply(replyDTO);
    }
}
