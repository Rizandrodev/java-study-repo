package com.java.opp.abs.teste;

import com.java.opp.abs.domain.Dev;
import com.java.opp.abs.domain.Funcionario;
import com.java.opp.abs.domain.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
//        Funcionario funcionario =new Funcionario("Zoro",40000);
        Gerente gerente =new Gerente("Nami",80000);
        Dev dev=new Dev("Lucas Montano",1000000);
  //      System.out.println(funcionario);
        System.out.println(gerente.toString());
        System.out.println(dev);


        gerente.Imprimir();
        dev.Imprimir();

    }
}
