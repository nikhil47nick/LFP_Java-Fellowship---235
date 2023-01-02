package com.bridgelabz.Day6;

public class MonthlyPayment {

    public static void main(String[] args){
        int p = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int r = Integer.parseInt(args[2]);
        int re = ( r / ( 12 * 100 ) );
        double payment =( p * re) / ( 1-(Math.pow(re,-(12*y) ) ) );

        System.out.println("Monthly payment: "+payment);

    }

}
