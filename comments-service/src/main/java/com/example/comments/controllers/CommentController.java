package com.example.comments.controllers;

import com.example.comments.models.Comment;
import com.example.comments.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentController {
    private final CommentService service;

    @GetMapping("/user/{id}")
    public List<Comment> getAll(@PathVariable Long id){
        return service.getAllCommentsByUserId(id);
    }

    @GetMapping("/user/{id}/sort")
    public List<Comment> sendBySort(@RequestParam(value = "offset", defaultValue = "0") Integer offset,
                              @RequestParam(value = "limit", defaultValue = "10") Integer limit,
                              @RequestParam(value = "sort", defaultValue = "1") Integer sortField,
                              @RequestParam(value = "pos", defaultValue = "2") Integer sortPos,
                              @PathVariable("id") Long id){
        return service.getSort(id, offset, limit, sortField, sortPos);
    }

    @GetMapping("/my/{id}")
    public List<Comment> getMyComment(@PathVariable("id") Long id){
        return service.getAllCommentsByAuthorId(id);
    }

    @PostMapping("/user/{id}/save/{authorId}")
    public ResponseEntity<HttpStatus> saveCom(@PathVariable("id") Long id,
                                              @PathVariable("authorId") Long authorId,
                                              @RequestBody Comment comment) throws IOException {
        service.saveComment(id, authorId, comment);
        return ResponseEntity.ok(HttpStatus.ACCEPTED);
    }

    @PutMapping("/user/{id}/update/{authorId}")
    public ResponseEntity<HttpStatus> upCom(@PathVariable("id") Long id,
                                            @PathVariable("authorId") Long authorId,
                                            @RequestBody Comment comment) throws IOException {
        service.updateComment(id,authorId, comment);
        return ResponseEntity.ok(HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/user/{id}/delete/{authorId}")
    public ResponseEntity<HttpStatus> delCom(@PathVariable("id") Long id,
                                             @PathVariable("authorId") Long authorId){
        service.deleteComment(id, authorId);
        return ResponseEntity.ok(HttpStatus.ACCEPTED);
    }
}
