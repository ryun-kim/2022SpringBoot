package com.koreait.springbootboard.board.comment;

import com.koreait.springbootboard.board.model.BoardCommentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired private CommentMapper mapper;

    public int insCmt(BoardCommentEntity entity){
        return mapper.insCmt(entity);
    }
}
