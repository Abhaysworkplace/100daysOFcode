package com.dayTwo;

import java.util.Scanner;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The maximum of three numbers is "+maximum(a,b,c));
        System.out.println("The minimum of three numbers is "+minimum(a,b,c));
    }
    public static int maximum(int a, int b, int c){
        return a>b?(a>c?a:c):(b>c?b:c);
    }

    public static int minimum(int a, int b, int c){
        if(a<b && a<c)
            return a;
        else if(b<c)
            return b;
        return c;
    }
}
