package com.koreait.springbootboard.board.comment;

import com.koreait.springbootboard.board.model.BoardCommentEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {

    int insCmt(BoardCommentEntity entity);
}
