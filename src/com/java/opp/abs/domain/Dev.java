package com.java.opp.abs.domain;

public class Dev extends  Funcionario{
    public Dev(String nome, double salary) {
        super(nome, salary);
    }

    @Override
    public void calculaBonus() {
        this.salary=this.salary*0.05;
    }

    @Override
        public String toString() {
            return "Dev{" +
                    "nome='" + nome + '\'' +
                    ", salary=" + salary +
                    '}';
        }

    @Override
    public void Imprimir() {
        super.Imprimir();
    }
}
