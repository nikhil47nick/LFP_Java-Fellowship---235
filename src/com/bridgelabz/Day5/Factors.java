package com.bridgelabz.Day5;

import java.util.Scanner;

public class Factors {

    public static void primeFactors(int num) {
        int n =num /2;
        int new1,p;
        for (int i = 1;i *i<=n;i++){

            if (n % i == 0 ){
                new1 = i /2;
                p = 0;
                for (int j = 2; j <= new1; j++) {
                    if (i % j == 0) {
                        p = 1;
                        break;
                    }
                }
        if (p == 0 )
        {
        System.out.print(" "+i);
            }
                            }
                                            }
    }

    /* Driver code */
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        primeFactors(n);
    }
}
