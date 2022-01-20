package com.dayFour;

import java.util.Scanner;

public class PasswordValidator {

    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<number;i++){
            String s=sc.nextLine();
            System.out.println(checker(s));
        }
    }

    public static String checker(String s){
        int uc=0;
        int lc=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.strip().charAt(i)>=65&&s.trim().charAt(i)<=90)
                uc++;

            if(s.strip().charAt(i)>=97&&s.trim().charAt(i)<=122)
                lc++;
            if(s.strip().charAt(i)>='0' && s.strip().charAt(i)<='9')
                count++;
        }
        if(lc>0&& uc>0 && count>0)
            return "YES";

        return "NO";
    }
}
