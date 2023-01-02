package com.bridgelabz.Day10.Employee;


import java.util.Random;

public class UC9 {

    public static final int IS_PARTTIME=1,IS_FULLTIME=2;
    private final int empRateHrs,numWork,maxHrsMonth;
    private final String company;
    private int totalwage;

    public UC9(String company, int empRateHrs,int numWork,int maxHrsMonth){
        this.company = company;
        this.numWork = numWork;
        this.maxHrsMonth = maxHrsMonth;
        this.empRateHrs = empRateHrs;
    }

    public void calEmpWage(){
        int total_EmpHr=0,empHrs=0,totalWorkDay=0;
        while (total_EmpHr < maxHrsMonth && totalWorkDay < numWork ){
            totalWorkDay++;
            empHrs = empPresentTime();
            total_EmpHr=total_EmpHr + empHrs;

        }
        totalwage=total_EmpHr * empRateHrs;
        System.out.println("Total Employee salary of "+company+" Company : "+ totalwage);

    }

    public int empPresentTime(){
        int rd = randomCheck();
        switch (rd) {
            case IS_PARTTIME:
                return 4;
            case IS_FULLTIME:
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

        UC9 dmart = new UC9("D-mart",20,21,150);
        UC9 reliance = new UC9("Reliance",20,10,100);
        dmart.calEmpWage();
        System.out.println(dmart);
        reliance.calEmpWage();
        System.out.println(reliance);
    }

}
