package com.java.opp.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User u=new User();
        u.membership="GOLD";
        u._name="Rui";

        User u2=new User();
        u2._name="Jolly";
        u.membership="Silver";

        System.out.println(u._name);
        System.out.println(u2._name);
        System.out.println(u2.age);


    }
}