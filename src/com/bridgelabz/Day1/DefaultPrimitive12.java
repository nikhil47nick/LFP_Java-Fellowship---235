package com.bridgelabz.Day1;

public class DefaultPrimitive12 {
		byte a;
	int b;
	long c;
	short d;
	float e;
	double f;
	char ch;
	boolean bool;
	
	void Display(){
			System.out.println("byte "+ a );
			System.out.println("int "+ b );
			System.out.println("long "+ c );
			System.out.println("short "+ d );
			System.out.println("float "+ e );
			System.out.println("double "+ f );
			System.out.println("char "+ ch );
			System.out.println("Boolean "+ bool );
	}
	
	
	public static void main(String[] args)
	{
		DefaultPrimitive12 dp = new DefaultPrimitive12();
		dp.Display();

	
	}
}