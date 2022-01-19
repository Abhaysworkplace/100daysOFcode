package com.dayThree;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,5);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public  static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(end>start){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
