package com.ssh.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Comment {
    private int commentid;
    private Date publishedtime;
    private String text;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (commentid != comment.commentid) return false;
        if (publishedtime != null ? !publishedtime.equals(comment.publishedtime) : comment.publishedtime != null)
            return false;
        if (text != null ? !text.equals(comment.text) : comment.text != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentid;
        result = 31 * result + (publishedtime != null ? publishedtime.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }
}
