package com.java.opp.polimorphim.domain;

public class Television extends Product{
    public static  final double IMPOSTO_POR_CENTO=0.21;
    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Tv");
        return this.value*IMPOSTO_POR_CENTO;
    }
}
