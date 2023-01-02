package com.bridgelabz.Day8.Employee;

import java.util.Random;

public class UC4 {
    public static final int is_PartTime=1,is_FullTime=2;
    public static void main(String[] args){

        Random ran = new Random();
        int randomCheck = ran.nextInt(3);
        int empRatePerHr=20;
        int empHrs;
        int salary;
        switch (randomCheck){
            case is_PartTime:empHrs=4;
            break;
            case is_FullTime:empHrs=8;
            break;
            default : empHrs=0;
        }
        salary= empHrs * empRatePerHr;
        System.out.println("Employee salary"+ salary);
    }
}
