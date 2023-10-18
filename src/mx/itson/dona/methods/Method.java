/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dona.methods;

import java.util.List;
import mx.itson.dona.entities.Comment;

/**
 *
 * @author luisd
 */
public class Method {

    /**
     * Este metodo manda a imprimir el ususario, fecha, descripcion, likes y dislikes del cada objeto comment que se tenga
     * @param comments lista de objetos Comment
     */
    public void printComment(List<Comment> comments) {

        for (Comment comment : comments) {
            System.out.println("\t Subido por " + comment.getUser().getName() + " el: " + comment.getDateComment()
                    + "\n  \t " + comment.getDescripcionComment()
                    + "\n  \t  Likes: " + comment.getLike() + " Dislikes: " + comment.getDislike() + "\n");
            if (comment.getComment() != null) {
                System.out.print("\t");
                printComment(comment.getComment());
            }
        }
    }
}
