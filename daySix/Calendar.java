package com.daySix;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
    public static void main(String[] args) {
        //The program needs to know how to compute the length of a month and a weekday of a given day
        LocalDate date=LocalDate.now();
        //we capture the current month and date
        int month=date.getMonthValue();
        int today=date.getDayOfMonth();

        date=date.minusDays(today-1);   //set to start of the month
        DayOfWeek weekday=date.getDayOfWeek();
        int value=weekday.getValue();  //1 = Monday , .... , 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i=1;i<value;i++)
            System.out.print("    ");

            while (date.getMonthValue()==month){
                System.out.printf("%3d",date.getDayOfMonth());
                if(date.getDayOfMonth()== today)
                    System.out.print("*");
                else
                    System.out.print(" ");
                date=date.plusDays(1);

                if(date.getDayOfWeek().getValue()==1) System.out.println();
            }
            if(date.getDayOfWeek().getValue()!=1) System.out.println();
    }
}
