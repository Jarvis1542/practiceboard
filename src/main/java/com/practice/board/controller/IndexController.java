package com.practice.board.controller;

import com.practice.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {
    @Autowired
    BoardService boardService;

    @GetMapping({"/", "/index"})
    public String index(Model model){
        model.addAttribute("list", boardService.boardList());
        return "index";
    }

    @GetMapping("/write")
    public String write(){
        return "write";
    }

    @GetMapping("/select/{bno}")
    public String select(@PathVariable("bno") Long bno, Model model){
        model.addAttribute("select", boardService.select(bno));
        model.addAttribute("reply", boardService.replyList(bno));
        boardService.count(bno);
        return "/select";
    }

    @GetMapping("/update/{bno}")
    public String update(@PathVariable("bno") Long bno, Model model){
        model.addAttribute("update", boardService.select(bno));
        return "/update";
    }
}