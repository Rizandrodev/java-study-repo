package com.java.opp.interf.domain;

public interface DataLoader {
    public static  final int MAX_DATA_SIZE=10;
     abstract  void load();

    default void checkPermissions(){
        System.out.println("Doing checkin of Permissions");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }

}
