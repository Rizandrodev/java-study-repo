package com.java.opp.enums.test;

import com.java.opp.enums.domain.Client;
import com.java.opp.enums.domain.Client.TipoPagamento;
import com.java.opp.enums.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Client client1=new Client("TSubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Client client2=new Client("TSubasa",TipoCliente.PESSOA_JURIDiCA, TipoPagamento.DEBITO);

        System.out.println(client1);
        System.out.println(client2);
    }
}
