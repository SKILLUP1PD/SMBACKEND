package com.joshi.socialmedia.SOCIALMEDIa.dao;

import com.joshi.socialmedia.SOCIALMEDIa.dashboard.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentDao extends JpaRepository<Comment,Long> {

}
