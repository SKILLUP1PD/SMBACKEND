package com.joshi.socialmedia.SOCIALMEDIa.dashboard;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Setter
@Getter
@Entity(name="dashboard")
public class DashboardEntity {

    private DashboardEntity(){

    }

    public DashboardEntity(String id, @NotBlank(message = "user is not empty") String username, String topicname, Integer like, String photo, String video, Date date) {
        this.id = id;
        this.username = username;
        this.topicname = topicname;
        this.like = like;
        this.photo = photo;
        this.video = video;
        this.date = date;
    }

    @Id
    @Column(name="id")
    private String id;

    @NotBlank(message = "user is not empty")
    @Column(name="username")
    private String username;

    @NotBlank(message="topic name is not empty")
    @Column(name="topic")
    private String topicname;

    @Column(name="likes")
    private Integer like;

    @Column(name="photo")
    private String photo;

    @Column(name="video")
    private String video;

    @Column(name="date")
    private Date date;


}
