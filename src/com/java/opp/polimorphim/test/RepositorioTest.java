package com.java.opp.polimorphim.test;

import com.java.opp.polimorphim.Repositorio.Repositorio;
import com.java.opp.polimorphim.servico.RepositorioDB;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio=new RepositorioDB();
        //bd
        repositorio.salve();
        List<String> list=new LinkedList<>();
        list.add("Naruto");
        list.add("Vegeta");
        System.out.println(list);



    }
}
