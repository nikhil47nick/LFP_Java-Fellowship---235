package com.bridgelabz.Day5;

import com.bridgelabz.Day1.LeapYear17;

import java.util.Scanner;

public class LeapYear {

    public void Leapyr(int yr){

        if ((yr % 4 == 0) && (yr % 100 == 0 )){
            if( yr % 400 == 0){
                System.out.println("Entered year is Leap year");
            }else{
                System.out.println("Year is not Leap year");
            }
        }else{
            System.out.println("Year is not Leap year");
        }
    }


    public static void main(String[] args)
    {
        LeapYear17 lp = new LeapYear17();

        System.out.println("Enter a year");
        Scanner scn = new Scanner(System.in);
        int yr = scn.nextInt();
        int num = yr;
        int count = 0;
        while(num != 0)
        {
            num = num/10;
            count++;

        }

        if(count == 4)
        {
            lp.Leapyr(yr);

        }else
        {
            System.out.println("Please enter year 4 Digit number");
        }

    }

}
