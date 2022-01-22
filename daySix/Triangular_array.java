package com.daySix;

public class Triangular_array {
    public static void main(String[] args) {
        final int NMAX=10;

        //allocate triangular array
        int[][] odds= new int[NMAX+1][];
        for (int i=0;i<=NMAX;i++)
            odds[i]=new int[i+1];

        //fill the triangular array
        for(int n=1;n< odds.length;n++)
            for(int k=0;k<odds[n].length;k++){
                int lotteryno=1;
                for(int i=1;i<=k;i++){
                    lotteryno=lotteryno*(n - i + 1) /i;

                    odds[n][k]=lotteryno;
                }
            }
        for(int[] val:odds) {
            for (int no : val)
                System.out.printf("%4d", no);
            System.out.println();
        }
    }
}
