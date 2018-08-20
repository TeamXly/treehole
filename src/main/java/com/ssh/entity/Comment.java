package com.ssh.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Comment {
    private int commentid;
    private Date publishedtime;
    private String text;
    private Integer postid;
    private Integer userid;
    private Post postByPostid;
    private User userByUserid;

    @Id
    @Column(name = "commentid", nullable = false)
    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    @Basic
    @Column(name = "publishedtime", nullable = false)
    public Date getPublishedtime() {
        return publishedtime;
    }

    public void setPublishedtime(Date publishedtime) {
        this.publishedtime = publishedtime;
    }

    @Basic
    @Column(name = "text", nullable = false, length = -1)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "postid", nullable = true)
    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    @Basic
    @Column(name = "userid", nullable = true)
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return commentid == comment.commentid &&
                Objects.equals(publishedtime, comment.publishedtime) &&
                Objects.equals(text, comment.text) &&
                Objects.equals(postid, comment.postid) &&
                Objects.equals(userid, comment.userid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commentid, publishedtime, text, postid, userid);
    }

    @ManyToOne
    @JoinColumn(name = "postid", referencedColumnName = "postid",insertable = false,updatable = false)
    public Post getPostByPostid() {
        return postByPostid;
    }

    public void setPostByPostid(Post postByPostid) {
        this.postByPostid = postByPostid;
    }

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "userid",insertable = false,updatable = false)
    public User getUserByUserid() {
        return userByUserid;
    }

    public void setUserByUserid(User userByUserid) {
        this.userByUserid = userByUserid;
    }
}
