package com.java.opp.Strings;

/**
    --Strings sao imutaveis toda vez que faco uma nova coisa tenho de criar uma string no pool
    --Stringbuilder os metodos trbalham directamente na memoria
        e tem de ter cuidado pra saber o que ele vai retornar
    --
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        String nome="William Suane";
        nome.concat("Devdojo");
        nome=nome.substring(0,3); 
        System.out.println(nome);

        StringBuilder sb=new StringBuilder("Wiliane Suane");//16
        sb.append(" Devdojo").append(" Academicy");
        sb.reverse();
        sb.reverse();
        //sb.delete();
        System.out.println(sb);

    }
    }


