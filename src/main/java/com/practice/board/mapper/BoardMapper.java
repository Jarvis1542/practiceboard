package com.practice.board.mapper;

import com.practice.board.domain.BoardListDTO;
import com.practice.board.domain.InsertDTO;
import com.practice.board.domain.SelectDTO;
import com.practice.board.domain.UpdateDTO;

import java.util.ArrayList;
import java.util.List;

public interface BoardMapper {
    void insert(InsertDTO insertDTO);
    ArrayList<BoardListDTO> boardList();
    SelectDTO select(Long bno);
    void count(Long bno);
    void update(UpdateDTO updateDTO);
    void delete(Long bno);
}
