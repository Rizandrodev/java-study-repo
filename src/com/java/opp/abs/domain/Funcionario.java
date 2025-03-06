package com.java.opp.abs.domain;
/*
    classe abstracta e uma classe que foi criada
    pra ser extendida
    Funcionario -->Template
 */
public abstract class   Funcionario {
    protected  String nome;
    protected  double salary;

    public  Funcionario(String nome,double salary) {

        this.nome=nome;
        this.salary = salary;
    }




}
