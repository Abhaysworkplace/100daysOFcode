package com.dayThree;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerNumberThanCurrent {

        public static int[] smallerNumbersThanCurrent(int[] nums) {
            int x=nums.length;
            int[] count=new int[x];
            for(int i=0;i<x;i++){
                for(int j=0;j<x;j++){
                    if(nums[j]<nums[i])
                        count[i]++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr =new int[5];
        System.out.print("Enter 5 numbers: ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The numbers below represent smaller amount of numbers corresponding to their index");
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    }
//This is the best algo i can think of and it shows a Runtime of 13ms?????

