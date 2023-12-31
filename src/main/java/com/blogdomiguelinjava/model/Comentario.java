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
@Table(name = "tb_comentarios")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComentario;

//    @Lob
//    @Column(nullable = false)
//    private String texto;

    @Column(columnDefinition = "TEXT")
    private String texto;

    @Column
    private Date dataDeCriacao;

    //idAutor
    //idPost

    @ManyToOne(optional = false)
    @JoinColumn(name = "idComentarioList")
    private Comentario comentario;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}
