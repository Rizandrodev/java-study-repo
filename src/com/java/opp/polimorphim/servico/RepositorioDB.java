package com.java.opp.polimorphim.servico;

import com.java.opp.polimorphim.Repositorio.Repositorio;

public class RepositorioDB implements Repositorio {
    @Override
    public void salve() {
        System.out.println("Save on a Database ");
    }
}
