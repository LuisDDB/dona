/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.dona.iu;

import mx.itson.dona.entities.User;
import mx.itson.dona.entities.Post;
import mx.itson.dona.entities.Rol;
import mx.itson.dona.entities.Category;
import mx.itson.dona.entities.Comment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luisd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rol r1= new Rol();
        r1.setNameRol("usuario");
        
        User user1 = new User();
        user1.setName("Paco");
        user1.setEmail("Paco@gmail.com");
        user1.setPassword("Paco12345");
        user1.setRol(r1);
        
        User user2 = new User();
        user1.setName("Pepe");
        user1.setEmail("Pepe@gmail.com");
        user1.setPassword("Pepe12345");
        user1.setRol(r1);
        
        Comment comment1 =new Comment();
        comment1.setUser(user2);
        comment1.setDescripcionComment(" ");
        comment1.setDateComment(new Date());
        comment1.setLike(500);
        comment1.setDislike(60);
        //comment1.setComment();
        
        List commentsPost =new ArrayList();
        commentsPost.add(comment1);

        Category c1 = new Category();
        c1.setNameCategory("Tecnologia");
        
        Post post1= new Post();
        post1.setTitule("Hola Amigos");
        post1.setDescripcionPost(" Soy un reptiliano");
        post1.setDatePost(new Date());
        post1.setLikePost(0);
        post1.setDislikePost(2000);
        post1.setCategory(c1);
        post1.setUserPost(user1);
        post1.setCommentPost(commentsPost);
        
        
    }
    
}
