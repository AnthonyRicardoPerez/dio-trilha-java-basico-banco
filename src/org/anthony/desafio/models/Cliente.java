package org.anthony.desafio.models;

public class Cliente {

    private String nome;
    private String sobrenomes;


    public Cliente(String nome, String sobrenomes) {
        this.nome = nome;
        this.sobrenomes = sobrenomes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenomes() {
        return sobrenomes;
    }

    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }
}
