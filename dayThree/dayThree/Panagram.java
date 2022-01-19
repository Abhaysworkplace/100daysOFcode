package com.dayThree;

import java.util.Scanner;

public class Panagram {
    public static boolean checkIfPangram(String sentence) {
        boolean[] count=new boolean[26];
        int index=0;
        for(int i=0;i<sentence.length();i++){
            index=sentence.charAt(i)-'a';
                count[index]=true;
        }
        for(int i=0;i<26;i++){
            if(!count[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.next();
        System.out.println("The String is a pangram ["+checkIfPangram(s)+"]");
    }
}
