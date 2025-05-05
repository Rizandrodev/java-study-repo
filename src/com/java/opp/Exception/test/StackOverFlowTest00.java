package com.java.opp.Exception.test;

public class StackOverFlowTest00 {
    public static void main(String[] args) {
        recursivity();

    }

    public  static  void recursivity(){
        recursivity();
    }

}
