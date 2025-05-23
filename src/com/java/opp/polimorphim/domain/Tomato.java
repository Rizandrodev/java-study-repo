package com.java.opp.polimorphim.domain;

public class Tomato extends  Product {
    public String DataValidade;
    public static  final double IMPOSTO_POR_CENTO=0.21;
    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o Imposto do Computador ");
        return this.value*IMPOSTO_POR_CENTO;
    }

    public String getValidade() {
        return DataValidade;
    }

    public void setValidade(String validade) {
        this.DataValidade= validade;
    }
}
