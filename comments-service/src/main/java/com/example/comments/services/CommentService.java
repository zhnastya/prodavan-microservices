package com.example.comments.services;

import com.example.comments.models.Comment;
import com.example.comments.repositories.CommentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepo repo;

    public Comment getCommentById(Long id) {
        return repo.getReferenceById(id);
    }

    public List<Comment> getAllCommentsByUserId(Long id) {
        return repo.findAllByUserId(id);
    }

    public List<Comment> getAllCommentsByAuthorId(Long id) {
        return repo.findAllByAuthorId(id);
    }

    public List<Comment> getSort(Long userId, Integer offset, Integer limit, Integer sortField, Integer sortPos) {
        String sorting;
        Sort.Direction sort;
        if (sortField == 1) {
            sorting = "timeOfCreated";
        } else {
            sorting = "rating";
        }
        if (sortPos == 1) {
            sort = Sort.Direction.ASC;
        } else {
            sort = Sort.Direction.DESC;
        }
        return repo.findByUserId(userId, PageRequest.of(offset, limit, Sort.by(sort, sorting))).getContent();
    }

    public void saveComment(Long userId, Long authorId, Comment comment) throws IOException {
        comment.setUserId(userId);
        comment.setAuthorId(authorId);
        repo.save(comment);
    }

    public void updateComment(Long userId, Long authorId, Comment comment) throws IOException {
        Comment comment1 = repo.findCommentByAuthorIdAndUserId(authorId, userId);
        comment1.setDescription(comment.getDescription());
        comment1.setRating(comment.getRating());
        comment1.setTimeOfCreated(LocalDateTime.now());
        repo.save(comment1);
    }

    public void deleteComment(Long userId, Long authorId){
        repo.deleteCommentByAuthorIdAndUserId(authorId, userId);
    }

}
