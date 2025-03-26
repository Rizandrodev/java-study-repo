package com.java.opp.interf.domain;

public class FileLoader implements  DataLoader,DataRemove {
    @Override
    public void load() {
        System.out.println("Loading data on a file...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data on file");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Check permission on File ");
    }
}
