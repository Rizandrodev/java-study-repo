package com.java.opp.polimorphim.test;

import com.java.opp.polimorphim.domain.Computer;
import com.java.opp.polimorphim.domain.Product;
import com.java.opp.polimorphim.domain.Television;
import com.java.opp.polimorphim.domain.Tomato;
import com.java.opp.polimorphim.servico.CalculadoraImposto;

public class ProductTest03 {
    public static void main(String[] args) {

        Computer product=new Computer("MAc AIr",300000);
        Tomato tomate=new Tomato("Sili",20);

        tomate.setValidade("11/12/2021");
        CalculadoraImposto.CalcuProduct(tomate);

    }
}
