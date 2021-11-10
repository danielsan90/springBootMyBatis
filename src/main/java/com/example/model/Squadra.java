package com.example.model;

import java.io.Serializable;

public class Squadra implements Serializable { //<- senza serializable torna nome e colore a null
    private int id;
    private String nome;
    private String colore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
}
