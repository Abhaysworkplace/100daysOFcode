package com.dayTwo;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        System.out.println("The factorial of "+number+" is "+factorial(number));
    }
    public static long factorial(long n){
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
}
