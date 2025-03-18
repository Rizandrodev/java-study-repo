package com.java.opp.interf.domain;

public class FileLoader implements  DataLoader {
    @Override
    public void load() {
        System.out.println("Loading data on a file...");
    }
}
