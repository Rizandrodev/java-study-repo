package com.java.opp.Inheritance;

public class Car extends  Velhice {
    private String  modelNAme="Mustang";
    public static void main(String[] args) {
        Car car=new Car();
        car.honk();

        System.out.println(car.brand+"  "+car.modelNAme);
    }
}
