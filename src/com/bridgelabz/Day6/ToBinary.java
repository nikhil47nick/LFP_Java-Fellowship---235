package com.bridgelabz.Day6;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args){
       Scanner scr = new Scanner(System.in);
       int n = scr.nextInt();
        System.out.println(n>>4);
        int binary[] = new int[40];
        int index = 0;
        while(n > 0){
            binary[index] = n%2;
            n = n/2;
            index++;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }


    }
}
