package com.dayTwo;

import java.util.Scanner;

public class digitsOfNumber {
    public static void main(String[] args) {
        //Subtract the Product and Sum of Digits of an Integer
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int rem=0;
        int multi=1;
        int sum=0;
        int sub=0;
        while(n>0){
            rem=n%10;
            multi*=rem;
            sum+=rem;
            n/=10;
        }

        System.out.println("The Product of the digits of the number is:"+multi);
        System.out.println("The Sum of the digits of the number is:"+sum);

        sub=multi-sum;
        System.out.println("The Subtraction of the Product and Sum of Digits of an Integer are:"+sub);
    }
}
