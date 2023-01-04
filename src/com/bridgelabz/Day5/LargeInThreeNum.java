package com.bridgelabz.Day5;

public class LargeInThreeNum {
    public static void main(String[] args){
        int num1 = 10,num2=20,num3=30;
        if(num1>num2 && num1>num3)
        {
            System.out.println("num1 is Bigger");
        } else if (num2>num1 && num2>num3) {
            System.out.println("number2 is Bigger");
        }else {
            System.out.println("number3 is Bigger");
        }
    }
}
