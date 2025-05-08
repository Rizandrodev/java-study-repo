package com.java.opp.Date.test;

/*
 ---Calendar e uma class abstracat
*/
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        if(c.getFirstDayOfWeek()==Calendar.SUNDAY){
            System.out.println("1st Day of the weekend is Sunday");
        }
        Date  date=c.getTime();
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH,3);
        System.out.println(date);
    }
}
