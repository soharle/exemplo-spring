package com.ifet.exemplo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Evento {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private Float duracao;

    @OneToMany(mappedBy = "evento")
    private List<Percurso> percursos;

    public Evento() {
    }

    public Evento(String nome, Float duracao) {
        this.nome = nome;
        this.duracao = duracao;
        this.percursos = new ArrayList<>();
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

    public Float getDuracao() {
        return duracao;
    }

    public void setDuracao(Float duracao) {
        this.duracao = duracao;
    }

    public List<Percurso> getPercursos() {
        return percursos;
    }

    public void setPercursos(List<Percurso> percursos) {
        this.percursos = percursos;
    }

}
