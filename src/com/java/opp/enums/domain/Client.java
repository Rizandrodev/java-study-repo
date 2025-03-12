package com.java.opp.enums.domain;

public class Client {

    public enum  TipoPagamento{
        DEBITO,CREDITO
    }

    public String nome;
    private TipoCliente tipoCliente;
    private  TipoPagamento tipoPagamento;

    public Client(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.getVALOR() +
                ", tipoClienteInt=" + tipoCliente.getNomeRelatorio() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
