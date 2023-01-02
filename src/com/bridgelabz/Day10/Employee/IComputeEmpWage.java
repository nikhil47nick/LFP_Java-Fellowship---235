package com.bridgelabz.Day10.Employee;

public interface IComputeEmpWage {

    public void addCompanyEmpWage(String company, int empRatePerhour, int numOfWorkingDays, int maxHrPerMonth);
    public void calEmpWage();
    public int getTotalWage(String company);

}
