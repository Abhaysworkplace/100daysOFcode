package com.dayTwo;

import java.util.Scanner;

public class pythogoran_Triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(isPytho(a,b,c))
            System.out.println("They are Pythogoran Triplet");
        else
            System.out.println("Nope!");
    }
    public static boolean isPytho(int a, int b, int c){
        int max=Math.max(a,Math.max(b,c));
        if(a==max){
            return a*a==b*b+c*c;
        }
        if(b==max){
            return b*b==a*a+c*c;
        }
        if(c==max){
            return c*c==b*b+a*a;
        }
        return false;
    }

}
