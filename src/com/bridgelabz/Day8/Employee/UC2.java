package com.bridgelabz.Day8.Employee;

import java.util.Random;

public class UC2 {
    public static void main(String[] args){
        int is_Present=1;
        Random ran = new Random();
        int randomCheck = ran.nextInt(2);
        int empRatePerHr=20;
        int empHrs=8;
        int salary;
        if ( is_Present == randomCheck ){
            salary= empHrs * empRatePerHr;
            System.out.println("Employee is present");
        }else{
            salary = 0;
            System.out.println("Employee is Absent");
        }
        System.out.println("Employee salary"+ salary);
    }
}
