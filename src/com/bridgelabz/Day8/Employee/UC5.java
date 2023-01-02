package com.bridgelabz.Day8.Employee;

import java.util.Random;

public class UC5 {
    public static final int is_PartTime=1,is_FullTime=2;
    public static void main(String[] args){

        Random ran = new Random();
        int randomCheck = ran.nextInt(3);
        int empRatePerHr=20;
        int empHrs;
        int salary;
        int totSal=0;
        int numWork=22;
        for (int i=1;i<=numWork;i++ ) {
            switch (randomCheck) {
                case is_PartTime:
                    empHrs = 4;
                    break;
                case is_FullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            salary = empHrs * empRatePerHr;
            totSal=totSal + salary;
        }
        System.out.println("Employee salary"+ totSal);
    }

}
