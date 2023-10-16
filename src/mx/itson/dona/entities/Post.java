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
public class Post {
    private String titule;
    private String descripcionPost;
    private User userPost;
    private Date datePost;
    private int likePost;
    private int dislikePost;
    private Category category;
    private List<Comment> commentPost;

    /**
     * @return the titule
     */
    public String getTitule() {
        return titule;
    }

    /**
     * @param titule the titule to set
     */
    public void setTitule(String titule) {
        this.titule = titule;
    }

    /**
     * @return the descripcionPost
     */
    public String getDescripcionPost() {
        return descripcionPost;
    }

    /**
     * @param descripcionPost the descripcionPost to set
     */
    public void setDescripcionPost(String descripcionPost) {
        this.descripcionPost = descripcionPost;
    }

    /**
     * @return the userPost
     */
    public User getUserPost() {
        return userPost;
    }

    /**
     * @param userPost the userPost to set
     */
    public void setUserPost(User userPost) {
        this.userPost = userPost;
    }

    /**
     * @return the datePost
     */
    public Date getDatePost() {
        return datePost;
    }

    /**
     * @param datePost the datePost to set
     */
    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    /**
     * @return the likePost
     */
    public int getLikePost() {
        return likePost;
    }

    /**
     * @param likePost the likePost to set
     */
    public void setLikePost(int likePost) {
        this.likePost = likePost;
    }

    /**
     * @return the dislikePost
     */
    public int getDislikePost() {
        return dislikePost;
    }

    /**
     * @param dislikePost the dislikePost to set
     */
    public void setDislikePost(int dislikePost) {
        this.dislikePost = dislikePost;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the commentPost
     */
    public List<Comment> getCommentPost() {
        return commentPost;
    }

    /**
     * @param commentPost the commentPost to set
     */
    public void setCommentPost(List<Comment> commentPost) {
        this.commentPost = commentPost;
    }
    
}
