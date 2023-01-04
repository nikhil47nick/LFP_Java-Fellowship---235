package com.bridgelabz.Day5;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipPercent {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Please Enter a number of times Coin Flip");
        int num = scr.nextInt();
        int head=0,tail=0;
        if (num >0)
        {
            for(int i=0;i<num;i++) {
                Random random = new Random();
                int ran = random.nextInt(1, 3);
                switch (ran)
                {
                    case 1:
                        head++;
                        break;
                    default:
                        tail++;
                        break;
                }
            }

            System.out.println("Head Percentage"+(head/num)*100);
            System.out.println("Tail Percentage"+(tail/num)*100);
        }

    }
}
