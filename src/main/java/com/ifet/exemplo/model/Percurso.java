package com.ifet.exemplo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Percurso {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private float quilometragem;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    public Percurso() {
    }

    public Percurso(String nome, float quilometragem, Evento evento) {
        this.nome = nome;
        this.quilometragem = quilometragem;
        this.evento = evento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

}
