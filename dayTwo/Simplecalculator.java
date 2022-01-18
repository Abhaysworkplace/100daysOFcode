package com.dayTwo;

import java.util.Scanner;

public class Simplecalculator{

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        char op=sc.next().trim().charAt(0);
        int ans=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch (op) {
            case '+' -> ans = a + b;
            case '-' -> ans = a - b;
            case '*' -> ans = a * b;
            case '/' -> ans = a / b;
            case '%' -> ans = a % b;
            default -> System.out.println("Not a valid Operation!");
        }
        //it is the same code from the day one just with an enhanced switch statement.
    }
}
