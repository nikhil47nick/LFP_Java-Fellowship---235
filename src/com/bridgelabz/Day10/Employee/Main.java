package com.bridgelabz.Day10.Employee;

public class Main {
    public static void main(String[] args) {

        IComputeEmpWage empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("D-mart",20,21,150);
        empWageBuilder.addCompanyEmpWage("Reliance",20,10,100);
        empWageBuilder.calEmpWage();
        System.out.println("Total Wage for D-mart Company: "+empWageBuilder.getTotalWage("D-mart"));
    }
}
