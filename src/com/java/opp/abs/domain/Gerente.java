package com.java.opp.abs.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salary) {
        super(nome, salary);
    }

    @Override
    public void calculaBonus() {
        this.salary=this.salary+this.salary*0.20 ;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome'"+nome+'\''+
                "salary=" + salary +
                '}';
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
    }
}
