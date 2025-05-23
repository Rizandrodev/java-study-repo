package com.java.opp.interf.test;

import com.java.opp.interf.domain.DataLoader;
import com.java.opp.interf.domain.DatabaseLoader;
import com.java.opp.interf.domain.FileLoader;

public class DataLoaderTeste {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader=new DatabaseLoader();
        FileLoader fileLoader=new FileLoader();


        databaseLoader.load();
        fileLoader.load();

        System.out.println();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermissions();
        fileLoader.checkPermissions();

        DatabaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();

    }
}
