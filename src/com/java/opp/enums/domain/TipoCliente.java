    package com.java.opp.enums.domain;

/*
    Enumerac

    Uso:
            usa quando temos uma escolha dentro de uma \
            qtd limirade de opcoes que precisa forcar o tipo a ser usado
            // classe onde atribumos atributos que nao pdm ser alterardos
//pd ficar dento de uma class
 */
public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Fisica"),
    PESSOA_JURIDiCA(2,"Pessoa Juridica"),
    ;

    private int VALOR; //tem que sempre depois das enums
    private String nomeRelatorio;

    TipoCliente(int valor,String nomeRelatorio) {
        this.VALOR=valor;
        this.nomeRelatorio=nomeRelatorio;
    }


    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getVALOR() {
        return VALOR;
    }
}


