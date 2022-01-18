package com.dayTwo;

import java.util.Scanner;

public class MaxNumber {
    //Take integer inputs till the user enters 0 and print the largest number from all
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        int max=number;
        while(number!=0) {
            System.out.print("Enter a new number:");
            number = sc.nextInt();
            if (max < number)
                max = number;
        }
        System.out.println("The largest of all numbers is :"+max);
    }
}
