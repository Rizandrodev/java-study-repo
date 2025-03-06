package com.java.opp.polimorphysm.exe.exe1;

public class Test {
    public static void main(String[] args) {
        Velhice[] ve=new Velhice[2];
        ve[0]=new Car();
        ve[1]=new Bicycle();

        for (Velhice v:ve){
            v.mover();
        }

    }
}
