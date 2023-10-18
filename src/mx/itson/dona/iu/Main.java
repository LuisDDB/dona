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
import mx.itson.dona.methods.Method;

/**
 *
 * @author luisd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rol r1 = new Rol();
        r1.setNameRol("usuario");

        // Se crea un usuario
        User user1 = new User();
        user1.setName("Phantasma");
        user1.setEmail("Phantasma@gmail.com");
        user1.setPassword("Phantasma12345");
        user1.setRol(r1);

        // se crea un usuario
        User user2 = new User();
        user2.setName("TheMonkeyParadox");
        user2.setEmail("TheMonkeyParadox@gmail.com");
        user2.setPassword("TheMonkeyParadox12345");
        user2.setRol(r1);

        User user3 = new User();
        user3.setName("Inugami06");
        user3.setEmail("Inugami06@gmail.com");
        user3.setPassword("Inugami12345");
        user3.setRol(r1);

        // se crea un comentario
        Comment comment1 = new Comment();
        comment1.setUser(user1);
        comment1.setDescripcionComment("El de Castlevania SOTN es épico .");
        comment1.setDateComment(new Date());
        comment1.setLike(500);
        comment1.setDislike(60);

        // se agrega un comentario
        List<Comment> commentsComment = new ArrayList();
        commentsComment.add(comment1);

        //Se crea un comentario
        Comment comment2 = new Comment();
        comment2.setUser(user2);
        comment2.setDescripcionComment("Zelda Ocarina of time y Castlevania symphony of the night.");
        comment2.setDateComment(new Date());
        comment2.setLike(60);
        comment2.setDislike(1);
        comment2.setComment(commentsComment);

        Comment comment3 = new Comment();
        comment3.setUser(user3);
        comment3.setDescripcionComment("halo reach y todos los souls");
        comment3.setDateComment(new Date());
        comment3.setLike(750);
        comment3.setDislike(0);

        // se agraga un comentario a una lista
        List<Comment> commentsPost = new ArrayList();
        commentsPost.add(comment2);
        commentsPost.add(comment3);

        //Se crea una categoria
        Category c1 = new Category();
        c1.setNameCategory("Tecnologia");

        // se crea un post
        Post post1 = new Post();
        post1.setTitule("¿Soundtrack de videojuegos que te hagan recuperar la fe en la humanidad?");
        post1.setDescripcionPost("Estaba navegando por Youtube y me apareció en "
                + "\n recomendados el Soundtrack de Donkey Kong Country. Yo nunca"
                + "\n lo he jugado pero al escuchar esa obra maestra, me hizo"
                + "\n recordar mi niñez. Cuando todo era simple y no tenía"
                + "\n preocupación. Quería saber si tienen algún soundtrack que"
                + "\n los haya marcado para escucharlos en la semana ya que trabajo"
                + "\n en casa y me gustaría algo de buen ambiente.");
        post1.setDatePost(new Date());
        post1.setLikePost(1524);
        post1.setDislikePost(16);
        post1.setCategory(c1);
        post1.setUserPost(user1);
        post1.setCommentPost(commentsPost);
        

        // Imprimir
        System.out.println("\nSubido por " + post1.getUserPost().getName() + " el " + post1.getDatePost()
                + " \n" + post1.getTitule()
                + " \n Categoria: " + post1.getCategory().getNameCategory()
                + "\n \n   " + post1.getDescripcionPost()
                + "\n  Likes: " + post1.getLikePost() + " Dislikes: " + post1.getDislikePost() + "\n");

        System.out.println(" ------Comentarios----- \n");
        Method print = new Method();
        print.printComment(post1.getCommentPost());

    }

}
