package com.java.opp.interf.domain;

public class DatabaseLoader implements DataLoader,DataRemove {
    @Override
    public void load() {
        System.out.println("Loading data on  Database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing datas on database ");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Check permission on database");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na Classe DatabaseLoader");
    }
}
