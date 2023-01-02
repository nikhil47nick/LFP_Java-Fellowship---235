package com.bridgelabz.Day9.Employee;

public class UC1 {
    public static void main(String[] args){
        int is_Present=1;
        int randomCheck = (int)(Math.random()*2);

        if ( is_Present == randomCheck ){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is Absent");
        }
    }
}
