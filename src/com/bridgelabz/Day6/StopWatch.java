package com.bridgelabz.Day6;

import java.util.Scanner;

public class StopWatch {



    public static void main(String[] args) throws InterruptedException {
        {
            Scanner scr = new Scanner(System.in);
            long start,end;
            double tim;
            System.out.println("Type Anything to start stop watch");
            char s = scr.next().charAt(0);
            start = System.currentTimeMillis();
            System.out.println("Enter anything to stop the watch");
            end = System.currentTimeMillis();
            tim = (end-start)/1000.0;
            System.out.println("The elapsed Time : "+tim);

        }
    }

}
