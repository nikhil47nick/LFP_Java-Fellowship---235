package com.bridgelabz.Day1;

public class DemoStaticmethodblock16 {
	static int a = 10;
	
	{
		System.out.println("Running Blocks ");
	}
	
	public static void demoMehod(){
		System.out.println("Demo Method");
	}
	
	public static void main(String[] args)
	{
	demoMehod();
	System.out.println("static int value"+a);
	
	}
}