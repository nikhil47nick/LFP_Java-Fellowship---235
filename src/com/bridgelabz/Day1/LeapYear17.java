package com.bridgelabz.Day1;

import java.util.Scanner;

public class LeapYear17 {
	
	
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
	
	if(yr >= 1582)
	{
		lp.Leapyr(yr);
		
	}else
	{
		System.out.println("Please enter year greater than 1582");
	}
	
	
	}
}