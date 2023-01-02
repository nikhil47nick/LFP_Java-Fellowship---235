package com.bridgelabz.Day5;

import java.util.Scanner;

public class SumOfIntZero {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter length for array");
        int n =scr.nextInt();
        int Array[] = new int[n];
        for (int i = 0;i<n;i++){
            System.out.println("Enter value for array");
            Array[i] = scr.nextInt();
        }

        for (int i = 0;i<n;i++){
            for(int j =0;j<n;j++) {
                if (i != j) {
                    for (int k = 0; k < n; k++){
                        if (i != j && i != k){

                            if (Array[i] + Array[j] +Array[k] == 0){
                                System.out.println("Array number add to zero is "+i+j+k+" values are "+Array[i]+Array[j]+Array[k]);
                            }

                        }
                    }
                }
            }
        }

    }
}
