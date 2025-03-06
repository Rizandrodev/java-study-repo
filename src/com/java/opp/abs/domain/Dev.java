package com.java.opp.abs.domain;

public class Dev extends  Funcionario{
    public Dev(String nome, double salary) {
        super(nome, salary);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", salary=" + salary +
                '}';
    }
}
