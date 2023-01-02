package com.bridgelabz.Day10.Employee;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class EmpWageBuilder implements IComputeEmpWage {
    public static final int IS_PARTTIME=1,IS_FULLTIME=2;
    private  int numOfCompany=0;
    private LinkedList<CompanyEmpWage> companyEmpWageList;
    private Map<String,CompanyEmpWage> companyEmpWageMap;

    public EmpWageBuilder(){
        companyEmpWageList = new LinkedList<>();
        companyEmpWageMap = new HashMap<>();
    }

    public void addCompanyEmpWage(String company, int empRateHrs,int numWork,int maxHrsMonth){
        CompanyEmpWage companyEmpWages = new CompanyEmpWage(company,empRateHrs,numWork,maxHrsMonth);
        companyEmpWageList.add(companyEmpWages);
        companyEmpWageMap.put(company,companyEmpWages);
    }

    public void calEmpWage(){
        for (int i=0;i<companyEmpWageList.size();i++){
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
        companyEmpWage.setTotalEmpWage(this.calEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
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

    public int getTotalWage(String company){
        return companyEmpWageMap.get(company).totalwage;
    }


}
