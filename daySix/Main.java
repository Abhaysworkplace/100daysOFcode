package com.daySix;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigInteger a=BigInteger.valueOf(10000000);
        BigInteger b=BigInteger.valueOf(20);
        Scanner sc=new Scanner(System.in);
        BigInteger x=sc.nextBigInteger();
        System.out.println(x.multiply(a.add(b)));
    }
}
