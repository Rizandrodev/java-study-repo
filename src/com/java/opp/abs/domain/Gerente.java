package com.java.opp.abs.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salary) {
        super(nome, salary);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome'"+nome+'\''+
                "salary=" + salary +
                '}';
    }
}
