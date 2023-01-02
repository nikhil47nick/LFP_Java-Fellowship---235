package com.bridgelabz.Day8.LineComparison;

import java.util.Scanner;

public class UC1 {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter start of line x and y ");
        double x1 =scr.nextInt(), y1 =scr.nextInt();
        System.out.println("Enter end of line x and y ");
        double x2 =scr.nextInt(), y2 =scr.nextInt();

        double Length= Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2));

        System.out.println("Length of line is: "+Length);
    }
}
