package com.java.opp.Date.test;

import java.util.Date;
/*
    --Classe Date usa millsegundos em long
    --e obsleta
 */
public class DateTest01 {
    public static void main(String[] args) {
        Date date=new Date();
        Date date1=new Date(1000000);
        System.out.println(date.getTime());
    }

}
