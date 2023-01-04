package com.bridgelabz.Day5;

public class PowerOf2 {

    public static void main(String[] args){
        //int n = Integer.parseInt(args[0]);
        int n=10;
        if (n >= 0 && n <= 31){
            int num=1;
            System.out.println("2 ^ 0 = 1");
            for (int i=1;i<=n;i++){
                num = num*2;
                System.out.println("2 ^ "+i +" = "+num);
            }
        }else{
            System.out.println("Number is not between 0 and 31");
        }
    }
}
