package com.java.opp.Strings;
//strings em java sao imutaveis
//   --
//
public class Stringstest01 {
    public static void main(String[] args) {
        String nome="William";//String constant Poll
        String nome2="William";
        nome=nome.concat("Riz");//nome+="Riz"
        System.out.println(nome);
        //System.out.println(nome==nome2);
        String nome3=new String("William");
        System.out.println(nome==nome3.intern());
    }
}
