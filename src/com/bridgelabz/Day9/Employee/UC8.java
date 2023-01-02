package com.bridgelabz.Day9.Employee;

import java.util.Random;

public class UC8 {

    public static final int is_PartTime=1,is_FullTime=2;

    public static void calEmpWage(String company,int empRateHrs,int numWork, int  maxHrsMonth){
        int total_EmpHr=0,empHrs=0,totalWorkDay=0;

        while (total_EmpHr < maxHrsMonth && totalWorkDay < numWork ){

            empHrs = empPresentTime();
            total_EmpHr=total_EmpHr + empHrs;

        }
        int totSal=total_EmpHr * empRateHrs;
        System.out.println("Total Employee salary of "+company+" Company : "+ totSal);

    }

    public static int empPresentTime(){
       int rd = randomCheck();
        switch (rd) {
            case is_PartTime:
                return 4;
            case is_FullTime:
                return 8;
            default:
                return 0;
        }
    }

    public static int randomCheck(){
        Random ran = new Random();
        return ran.nextInt(3);
    }

    public static void main(String[] args) {
        calEmpWage("D-mart",20,21,150);
        calEmpWage("Reliance",20,10,100);
    }

}
