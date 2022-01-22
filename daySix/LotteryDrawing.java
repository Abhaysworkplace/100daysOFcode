package com.daySix;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many numbers Do you want to draw? ");
        int draw=sc.nextInt();
        System.out.print("What is the highest number you can Draw? ");
        int high=sc.nextInt();

        int[] numbers=new int[high];

        for(int j=0;j<high;j++)
            numbers[j]=j+1;
        int[] result=new int[draw];

        for(int i=0;i<draw;i++){
            int r=(int)(Math.random()*high);
            result[i]=numbers[r];
            numbers[r]=numbers[high-1];
            high--;
        }
        Arrays.sort(result);
        System.out.println("Bet on These numbers and get rich$");
//        System.out.println(Arrays.toString(result));
        for(int k:result)
            System.out.println(k);
    }
}
