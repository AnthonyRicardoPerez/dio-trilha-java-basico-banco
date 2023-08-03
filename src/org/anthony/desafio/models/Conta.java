package org.anthony.desafio.models;

import org.anthony.desafio.exceptions.DinheiroInsuficienteExc;

public class Conta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected String cliente;
    protected String banco;

    public Conta(int agencia, int numero, double saldo, String cliente, String banco) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void debito(double monto, Conta conta){
        double newSaldo= this.saldo - monto;
        if (newSaldo <= 0){
            throw new DinheiroInsuficienteExc("Dinheiro insuficiente na conta");
        }
        this.saldo = newSaldo;
    }

    public void credito(double monto){
        this.saldo = this.saldo + monto;
    }

    public void descriçãoTransação(Conta conta) {
        System.out.println(String.format("Titular: " + conta.getCliente()));
        System.out.println(String.format("Agencia: " + conta.getAgencia()));
        System.out.println(String.format("Numero: " +conta.getNumero()));
        System.out.println(String.format("Saldo: "  + conta.getSaldo()));
        System.out.println(String.format("Banco: "  + conta.getBanco()));
    }

}
