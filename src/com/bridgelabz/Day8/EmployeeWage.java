package com.bridgelabz.Day8;

import java.util.Random;

public class EmployeeWage {

    public static final int is_PartTime=1,is_FullTime=2;


    public static int randomNum(int rdcheck){
        switch (rdcheck) {
            case is_PartTime:
                return 4;
            case is_FullTime:
                return 8;
            default:
                return 0;
        }
    }

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

            empHrs = randomNum(randomCheck);
            total_EmpHr=total_EmpHr + empHrs;

        }
        totSal=total_EmpHr * empRatePerHrs;
        System.out.println("Employee salary"+ totSal);
    }
}
