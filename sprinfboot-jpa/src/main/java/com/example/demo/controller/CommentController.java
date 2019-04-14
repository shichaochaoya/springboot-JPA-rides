package com.example.demo.controller;

import com.example.demo.pojo.Comment;
import com.example.demo.repository.CommentDal;
import com.example.demo.repository.CommentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    /**
     * jpa操作
     */
    private final CommentDal commentDal;
    /**
     * 自定义操作
     **/
    private final CommentRepository commentRepository;


    /**
     * 最好的方式，用构造函数注入，通过容器new一个
     */
    public CommentController(CommentDal commentDal, CommentRepository commentRepository) {
        this.commentDal = commentDal;
        this.commentRepository = commentRepository;
    }


    /**
     * jpa操作
     */
    @GetMapping
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @GetMapping("/{commentId}")
    public Comment getComment(@PathVariable String commentId) {
        return commentRepository.findById(commentId).orElse(null);
    }

    @GetMapping("/{commentId}/tags")
    public Object getAllTags(@PathVariable String commentId) {
        Comment comment = commentRepository.findById(commentId).orElse(null);
        if (comment != null) {
            return comment.getTags();
        } else {
            return "Comment not found";
        }
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }


    /**
     * 自定义操作
     **/
    @GetMapping("/all")
    public List<Comment> getAllComment() {
        return commentDal.getAll();
    }

    @GetMapping("/get/{commentId}")
    public Comment getById(@PathVariable String commentId) {
        return commentDal.getById(commentId);
    }

    @GetMapping("/get/{commentId}/tags")
    public Object getTagsById(@PathVariable String commentId) {
        return commentDal.getAllTags(commentId);
    }

    @PostMapping("/add")
    public Comment addComment(@RequestBody Comment comment) {
        return commentDal.addComment(comment);
    }

    @PostMapping("/{commentId}/{key}/{value}")
    public String addTag(@PathVariable String commentId,
                         @PathVariable String key,
                         @PathVariable String value) {
        return commentDal.addTag(commentId, key, value);
    }

    @GetMapping("/stats/star")
    public String countStar(){
        return commentDal.statAnalysis();
    }
}