package com.java.opp.polimorphim.domain;

public class Computer extends  Product  {
    public static  final double IMPOSTO_POR_CENTO=0.21;
    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcularImposto() {

        return this.value*IMPOSTO_POR_CENTO;
    }
}
