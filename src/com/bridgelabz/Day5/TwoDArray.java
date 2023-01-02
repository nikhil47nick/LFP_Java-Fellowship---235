package com.bridgelabz.Day5;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int m = scr.nextInt();
        int n = scr.nextInt();
        int[][] int_Array= new int[m][n];

        System.out.println("Enter value for Array"+ m+"x"+n);
        for (int i =0;i<m;i++) {
            for (int j = 0; j < n; j++){
                int_Array[i][j] = scr.nextInt();
            }
        }
        for (int i =0;i<m;i++) {
            for (int j = 0; j < n; j++){
                System.out.print("["+i+"]"+"["+j+"] "+int_Array[i][j]+" ");
                writer.write("["+i+"]"+"["+j+"] "+int_Array[i][j]+" ");
            }
        }
        writer.flush();
        writer.close();
    }
}
