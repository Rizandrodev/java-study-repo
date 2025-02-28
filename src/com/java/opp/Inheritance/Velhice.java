package com.java.opp.Inheritance;

/*
       In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.

In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):
*/
public class Velhice {
    protected  String brand="Ford";
    public void honk(){
        System.out.println("Vrumm");
    }
}
