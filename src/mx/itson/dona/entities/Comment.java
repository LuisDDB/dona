/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dona.entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author luisd
 */
public class Comment {
    private String descripcionComment;
    private User user;
    private Date dateComment;
    private int like;
    private int dislike;
    private List<Comment> comment;

    /**
     * @return the descripcionComment
     */
    public String getDescripcionComment() {
        return descripcionComment;
    }

    /**
     * @param descripcionComment the descripcionComment to set
     */
    public void setDescripcionComment(String descripcionComment) {
        this.descripcionComment = descripcionComment;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the dateComment
     */
    public Date getDateComment() {
        return dateComment;
    }

    /**
     * @param dateComment the dateComment to set
     */
    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }

    /**
     * @return the like
     */
    public int getLike() {
        return like;
    }

    /**
     * @param like the like to set
     */
    public void setLike(int like) {
        this.like = like;
    }

    /**
     * @return the dislike
     */
    public int getDislike() {
        return dislike;
    }

    /**
     * @param dislike the dislike to set
     */
    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    /**
     * @return the comment
     */
    public List<Comment> getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
    
}
