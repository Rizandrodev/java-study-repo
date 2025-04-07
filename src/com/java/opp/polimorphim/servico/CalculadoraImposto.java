package com.java.opp.polimorphim.servico;
import com.java.opp.polimorphim.domain.Computer;
import com.java.opp.polimorphim.domain.Product;
import com.java.opp.polimorphim.domain.Tomato;

public  class CalculadoraImposto {


    public static void CalcuProduct(Product product){
        System.out.println("Realatorio de Imposto do Tomato");
        double imposto=product.calcularImposto();
        System.out.println("computador"+product.getName());
        System.out.println("Valor"+product.getValue());
        System.out.println("Imposto a ser Pago"+imposto);

        if(product instanceof Tomato){ //instanceof diz se product e uma instacia de Tomato
            Tomato tomate=(Tomato) product;// () cast
            //String dataValidade=((Tomato)product).getValidade();//Cast 2 ((Tomato)progunt).metod
            System.out.println(tomate.getValidade());
            //System.out.println(dataValidade);
        }

    }
}
    //Se nao estiver acessar atributos de classe posso deixar meu metodo estatico