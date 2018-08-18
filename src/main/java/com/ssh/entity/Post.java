package com.ssh.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Post {
    private int postid;
    private Date publishedtime;
    private String title;
    private String text;
    private int like;
    private int dislike;
    private boolean isboutique;

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
    public Date getPublishedtime() {
        return publishedtime;
    }

    public void setPublishedtime(Date publishedtime) {
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
    @Column(name = "like", nullable = false)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (postid != post.postid) return false;
        if (like != post.like) return false;
        if (dislike != post.dislike) return false;
        if (isboutique != post.isboutique) return false;
        if (publishedtime != null ? !publishedtime.equals(post.publishedtime) : post.publishedtime != null)
            return false;
        if (title != null ? !title.equals(post.title) : post.title != null) return false;
        if (text != null ? !text.equals(post.text) : post.text != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postid;
        result = 31 * result + (publishedtime != null ? publishedtime.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + like;
        result = 31 * result + dislike;
        result = 31 * result + (isboutique ? 1 : 0);
        return result;
    }
}
