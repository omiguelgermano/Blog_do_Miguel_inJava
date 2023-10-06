package com.blogdomiguelinjava.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPost;

    @Column(nullable = false, length = 255)
    private String titulo;

    //    @Lob
    //    @Column(nullable = false)
    //    private String conteudo;

    @Column(columnDefinition = "TEXT")
    private String conteudo;

    @Column
    private Date dataDeCriacao;

    //Id autor
    @ManyToOne(optional = false)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

}
