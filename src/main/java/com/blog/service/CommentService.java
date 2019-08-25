package com.blog.service;

import com.blog.domain.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    List<Comment> allComments(int article_id, int offset, int limit);
    int insertComment(Comment comment);
    int countAllNum();
    boolean delById(Long id);
}
