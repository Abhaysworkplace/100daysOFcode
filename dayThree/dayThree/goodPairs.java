package com.dayThree;

import java.util.Scanner;

public class goodPairs {
        public static int numIdenticalPairs(int[] nums) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j])
                        count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[8];
        System.out.print("Enter 8 numbers :");
        for (int i=0;i<8;i++)
            arr[i]=sc.nextInt();
        System.out.println("The number of Good pairs in the array is :"+numIdenticalPairs(arr));
    }
    }
