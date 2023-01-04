package com.bridgelabz.Day5;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a Number for value a");
        double a = scr.nextDouble();
        System.out.println("Enter a Number for value b");
        double b = scr.nextDouble();
        System.out.println("Enter a Number for value c");
        double c = scr.nextDouble();
        double root1,root2;
        double delta = (b * b) - (4 * a * c) ;
        if (delta > 0) {
            System.out.println("delta is real Number");
            root1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
            root2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("Roots are R1 :" + root1 +"  and R2 : "+ root2);
        }else {
            System.out.println("Root is Not real Number");
        }

    }

}
