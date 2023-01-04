package com.bridgelabz.Day5;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
         float num =0f,har;
        for (int i = 1;i <= n;i++){
            har = 1/(float)i;
            System.out.println(i+"th Harmonic value: "+har);
            num = num + har;
        }
        System.out.println("Nth Harmonic number : "+num);
    }
}
