package com.bridgelabz.Day9.Employee;

import java.util.Random;

public class UC6 {
    public static final int is_PartTime=1,is_FullTime=2;
    public static void main(String[] args){

        Random ran = new Random();
        int randomCheck = ran.nextInt(3);
        int empHrs;
        int totSal=0;
        int numWork=20;
        int max_Hrs_Month=100;
        int totalWorkDays=0;
        int total_EmpHr=0;
        int empRatePerHrs=20;

        while (total_EmpHr < max_Hrs_Month && totalWorkDays < numWork ){

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
            total_EmpHr=total_EmpHr + empHrs;

        }
        totSal=total_EmpHr * empRatePerHrs;
        System.out.println("Employee salary"+ totSal);
    }
}
