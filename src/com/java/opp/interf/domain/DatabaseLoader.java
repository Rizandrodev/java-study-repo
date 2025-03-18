package com.java.opp.interf.domain;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Loading data on Database...");
    }
}
