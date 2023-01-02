package com.bridgelabz.Day8.Employee;

import java.util.Random;

public class UC3 {
    public static void main(String[] args){
        int is_PartTime=1,is_FullTime=2;
        Random ran = new Random();
        int randomCheck = ran.nextInt(3);
        int empRatePerHr=20;
        int empHrs;
        int salary;
        if ( is_FullTime == randomCheck ){
            empHrs =8;

            System.out.println("Employee present full time");
        }else if ( is_PartTime == randomCheck ){
            empHrs =4;
            System.out.println("Employee present part time");
        }else {
            empHrs=0;
            System.out.println("Employee absent");
        }
        salary= empHrs * empRatePerHr;
        System.out.println("Employee salary"+ salary);
    }
}
