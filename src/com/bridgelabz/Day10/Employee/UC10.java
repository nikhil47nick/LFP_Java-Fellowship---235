package com.bridgelabz.Day10.Employee;

import java.util.Random;

public class UC10 {
    public static final int IS_PARTTIME=1,IS_FULLTIME=2;
    private  int numOfCompany=0;
    private CompanyEmpWage[] companyEmpWageArray;
    public UC10(){
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    public void addCompanyEmpWage(String company, int empRateHrs,int numWork,int maxHrsMonth){
        companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRateHrs,numWork,maxHrsMonth);
        numOfCompany++;
    }

    private void calEmpWage(){
        for (int i=0;i<numOfCompany;i++){
            companyEmpWageArray[i].setTotalEmpWage(this.calEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    public int calEmpWage(CompanyEmpWage companyEmpWage){
        int total_EmpHr=0,empHrs=0,totalWorkDay=0;
        while (total_EmpHr < companyEmpWage.maxHrsMonth && totalWorkDay < companyEmpWage.numWork ){
            totalWorkDay++;
            empHrs = empPresentTime();
            total_EmpHr=total_EmpHr + empHrs;
        }
        return total_EmpHr*companyEmpWage.empRateHrs;
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

        UC10 empWageBuilder = new UC10();
        empWageBuilder.addCompanyEmpWage("D-mart",20,21,150);
        empWageBuilder.addCompanyEmpWage("Reliance",20,10,100);
        empWageBuilder.calEmpWage();
    }
}
