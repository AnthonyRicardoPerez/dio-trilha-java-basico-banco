package org.anthony.desafio.models;

public class Banco {
    private String nome;
    private  Conta conta;

    private Cliente cliente;
    public Banco( String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
