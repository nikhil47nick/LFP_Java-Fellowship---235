package com.bridgelabz.Day6;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

    public static boolean isPresent(int[] array,int ran_coup){
        int count = 0;
        for (int i = 0;i<array.length;i++){
            if (ran_coup == array[i]){
                count++;
            }
        }

        if (count == 0) {
            return false;
        }
        else {
            return true;
        }

    }



    public static void main(String[] args){
        System.out.println("How many Random Coupons you want generate");
        Scanner scr = new Scanner(System.in);
        int dis_coup_num = scr.nextInt();
        int[] array = new int[dis_coup_num];
        Random ran = new Random();
        int ran_coup=0;
        boolean check;
        for (int i = 0;i<array.length;i++){
            ran_coup = ran.nextInt(20);
            check = isPresent(array,ran_coup);
            if(check == false){
                array[i] = ran_coup;
            }else{
                i--;
            }
        }
        scr.close();
        discoupnum(array);

    }



    public static void discoupnum (int[] array){
        System.out.println("Coupon number are ");
        for (int i = 0;i<array.length;i++){
            System.out.println(""+array[i]);
        }
    }


}
