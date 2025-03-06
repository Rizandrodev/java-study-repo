package com.java.opp.polimorphysm.t1;

public class test {
    public static void main(String[] args) {
        Cat cat =new Cat();
        cat.makeSound();

        Dog dog =new Dog();
        dog.makeSound();
    }
}
//meuAnimal é do tipo Animal, mas pode "apontar" para um Cachorro ou um Gato.
//Quando chamamos fazerSom(), o Java decide na hora qual versão do método usar (a do Cachorro ou a do Gato). Isso é o polimorfismo!