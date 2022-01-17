package com.dayone;

import java.util.Scanner;

public class basicOperatorCalculator {
    public static void main(String[] args) {
        operations ope=new operations();
        ope.go();
    }
}
class operations{
    Scanner sc=new Scanner(System.in);
    public void go() {
        int ans=0;
        while (true) {
            System.out.print("Enter the basic operation:");
            char op = sc.next().trim().charAt(0);
            if(op=='x')
                break;
            System.out.print("Enter the two integers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(op=='+')
                ans=a+b;
            else if (op=='-')
                ans=a-b;
            else if(op=='*')
                ans=a*b;
            else if(op=='/')
                ans=a/b;
            else if(op=='%')
                ans=a%b;
            else
                System.out.println("Not a valid Operation!");
            System.out.println("the answer is "+ans);

        }
    }
}
// I just realised that the entire program would require less code if I would use switch!
