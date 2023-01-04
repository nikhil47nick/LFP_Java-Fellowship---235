package com.bridgelabz.Day10.Employee;

public class CompanyEmpWage{
        public final int empRateHrs,numWork,maxHrsMonth;
        public final String company;
        public int totalwage;

        public CompanyEmpWage(String company, int empRateHrs,int numWork,int maxHrsMonth){
            this.company = company;
            this.numWork = numWork;
            this.maxHrsMonth = maxHrsMonth;
            this.empRateHrs = empRateHrs;
            totalwage=0;
        }

        public void setTotalEmpWage(int totalEmpWage){
            this.totalwage=totalEmpWage;
        }
    }

