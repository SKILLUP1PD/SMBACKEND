package com.joshi.socialmedia.SOCIALMEDIa.dashboard;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity(name="comment")
public class Comment {

    @Id
    private int id;

    @Column(name="parentId")
    private int parentId;

    @Column(name="comment")
    private String comment;

    @Column(name="totalLikes")
    private int commentLike;

    @Column(name="creationDate")
    private Date date;

}
