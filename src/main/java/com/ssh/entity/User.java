package com.ssh.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {
    private int userid;
    private String username;
    private String password;
    private String email;
    private String type;
    private String phone;
    private Collection<Comment> commentsByUserid;
    private Collection<Comment> commentsByUserid_0;
    private Collection<Post> postsByUserid;
    private Collection<Post> postsByUserid_0;

    @Id
    @Column(name = "userid", nullable = false)
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 20)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 11)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userid == user.userid &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(email, user.email) &&
                Objects.equals(type, user.type) &&
                Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userid, username, password, email, type, phone);
    }

    @OneToMany(mappedBy = "userByUserid")
    public Collection<Comment> getCommentsByUserid() {
        return commentsByUserid;
    }

    public void setCommentsByUserid(Collection<Comment> commentsByUserid) {
        this.commentsByUserid = commentsByUserid;
    }

    @OneToMany(mappedBy = "userByUserid_0")
    public Collection<Comment> getCommentsByUserid_0() {
        return commentsByUserid_0;
    }

    public void setCommentsByUserid_0(Collection<Comment> commentsByUserid_0) {
        this.commentsByUserid_0 = commentsByUserid_0;
    }

    @OneToMany(mappedBy = "userByUserid")
    public Collection<Post> getPostsByUserid() {
        return postsByUserid;
    }

    public void setPostsByUserid(Collection<Post> postsByUserid) {
        this.postsByUserid = postsByUserid;
    }

    @OneToMany(mappedBy = "userByUserid_0")
    public Collection<Post> getPostsByUserid_0() {
        return postsByUserid_0;
    }

    public void setPostsByUserid_0(Collection<Post> postsByUserid_0) {
        this.postsByUserid_0 = postsByUserid_0;
    }
}
