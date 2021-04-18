package com.joshi.socialmedia.SOCIALMEDIa.controllers;

import com.joshi.socialmedia.SOCIALMEDIa.dao.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RequestMapping("/v1")
@RestController
public class Comment {

    @Autowired
    private CommentDao commentDao;

    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment){

        return null;
    }

    @RequestMapping(value="/deleteComment",method = RequestMethod.DELETE)
    public ResponseEntity<Comment> deleteComment(@RequestParam String username,@RequestParam int id){

        return null;
    }

    @RequestMapping(value="/editComment",method = RequestMethod.PATCH)
    public ResponseEntity<Comment> modifyComment(@RequestParam int id{

        return null;
    }

}
