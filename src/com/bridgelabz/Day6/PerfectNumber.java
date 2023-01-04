package com.bridgelabz.Day6;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scr.nextInt();
        int perfect_num = 0;
        for (int i=1;i<=(num/2);i++){
            if (num%i == 0){
                perfect_num = perfect_num + i;
            }
        }
        if (perfect_num == num)
        {
            System.out.println("NUmber Is perfect Number");
        }else{
            System.out.println("NUmber Is not perfect Number");
        }
    }

}
