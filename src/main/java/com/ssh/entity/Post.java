package com.ssh.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Post {
    private int postid;
    private Timestamp publishedtime;
    private String title;
    private String text;
    private int like;
    private int dislike;
    private boolean isboutique;
    private Integer userid;
    private Collection<Comment> commentsByPostid;
    private Collection<Comment> commentsByPostid_0;
    private User userByUserid;
    private User userByUserid_0;

    @Id
    @Column(name = "postid", nullable = false)
    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    @Basic
    @Column(name = "publishedtime", nullable = false)
    public Timestamp getPublishedtime() {
        return publishedtime;
    }

    public void setPublishedtime(Timestamp publishedtime) {
        this.publishedtime = publishedtime;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 200)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @Column(name = "t_like", nullable = false)
    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    @Basic
    @Column(name = "dislike", nullable = false)
    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    @Basic
    @Column(name = "isboutique", nullable = false)
    public boolean isIsboutique() {
        return isboutique;
    }

    public void setIsboutique(boolean isboutique) {
        this.isboutique = isboutique;
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
        Post post = (Post) o;
        return postid == post.postid &&
                like == post.like &&
                dislike == post.dislike &&
                isboutique == post.isboutique &&
                Objects.equals(publishedtime, post.publishedtime) &&
                Objects.equals(title, post.title) &&
                Objects.equals(text, post.text) &&
                Objects.equals(userid, post.userid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(postid, publishedtime, title, text, like, dislike, isboutique, userid);
    }

    @OneToMany(mappedBy = "postByPostid")
    public Collection<Comment> getCommentsByPostid() {
        return commentsByPostid;
    }
    public void setCommentsByPostid(Collection<Comment> commentsByPostid) {
        this.commentsByPostid = commentsByPostid;
    }

    @OneToMany(mappedBy = "postByPostid_0")
    public Collection<Comment> getCommentsByPostid_0() {
        return commentsByPostid_0;
    }

    public void setCommentsByPostid_0(Collection<Comment> commentsByPostid_0) {
        this.commentsByPostid_0 = commentsByPostid_0;
    }

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "userid",insertable = false,updatable = false)
    public User getUserByUserid() {
        return userByUserid;
    }
    public void setUserByUserid(User userByUserid) {
        this.userByUserid = userByUserid;
    }

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "userid",insertable = false,updatable = false)
    public User getUserByUserid_0() {
        return userByUserid_0;
    }

    public void setUserByUserid_0(User userByUserid_0) {
        this.userByUserid_0 = userByUserid_0;
    }
}
