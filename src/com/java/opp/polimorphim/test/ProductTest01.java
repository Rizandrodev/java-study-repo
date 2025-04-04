package com.java.opp.polimorphim.test;

import com.java.opp.polimorphim.domain.Computer;
import com.java.opp.polimorphim.domain.Television;
import com.java.opp.polimorphim.domain.Tomato;
import com.java.opp.polimorphim.servico.CalculadoraImposto;

public class    ProductTest01 {
    public static void main(String[] args) {

        Computer computer = new Computer("Vpceh", 1200);
        Tomato tomato = new Tomato("Tomate sili", 10);
        Television Tv=new Television("Samusng 50\" ",2000);
        CalculadoraImposto.CalcuProduct(computer);
        System.out.println("-------------------------------------");
        CalculadoraImposto.CalcuProduct(tomato);
        System.out.println("-------------------------------------");
        CalculadoraImposto.CalcuProduct(Tv);
    }
}
