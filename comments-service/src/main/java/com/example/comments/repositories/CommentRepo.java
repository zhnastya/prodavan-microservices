package com.example.comments.repositories;

import com.example.comments.models.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment, Long> {
    Page<Comment> findByUserId(Long userId, Pageable pageable);
    List<Comment> findAllByUserId(Long userId);
    List<Comment> findAllByAuthorId(Long authorId);
    Comment findCommentByAuthorIdAndUserId(Long authorId, Long userId);
    void deleteCommentByAuthorIdAndUserId(Long authorId, Long userId);
}
