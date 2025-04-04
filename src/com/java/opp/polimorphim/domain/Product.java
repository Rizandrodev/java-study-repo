package com.java.opp.polimorphim.domain;

public abstract class  Product implements Taxavel{
    protected String name;
    protected double value;

    public Product(String name,double value) {
        this.name = name;
        this.value=value;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
