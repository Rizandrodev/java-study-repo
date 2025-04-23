package com.java.opp.Strings;

public class StringsTest02 {
    public static void main(String[] args) {
        String nome="Luffy ";
        String numbers="012345";
        System.out.println(nome.charAt(0));//pos da string
        System.out.println(nome.length());//Tamanho da string
        System.out.println(nome.replace("L","Y"));
        System.out.println(nome.toLowerCase());//tudo minusculo
        System.out.println(nome.toUpperCase());//tudo maiusculo
        System.out.println(numbers.substring(0,3));//pegar um ponto ao outro
        System.out.println(nome.trim());//Remove os espaco em branco
    }
}
