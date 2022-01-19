package com.dayThree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithCandies {
        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int sum=0;
            List<Boolean>newx=new ArrayList<>();
            for(int i=0;i<candies.length;i++){
                if(sum<candies[i])
                    sum=candies[i];
            }
            for(int i=0;i<candies.length;i++){
                newx.add(candies[i]+extraCandies>=sum);
            }
            return newx;
        }

    public static void main(String[] args) {
            int[] candies=new int[5];
            int extraCandies=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of candies with th 5 children: ");
        for (int i=0;i<5;i++)
            candies[i]=sc.nextInt();
        System.out.print("Enter the Amount of Extrs Candy: ");
        extraCandies=sc.nextInt();
        System.out.print("The Children with lowest candy will appear false");
        System.out.println(kidsWithCandies(candies,extraCandies));

    }
}
