package com.java.opp.polimorphim.servico;

import com.java.opp.polimorphim.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salve() {
        System.out.println("Salve in a archieve");
    }
}
