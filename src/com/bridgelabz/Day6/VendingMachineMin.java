package com.bridgelabz.Day6;

import java.util.Scanner;

public class VendingMachineMin {


    public static void main(String[] args){
        int[] notes = new int[] {1000,500,100,50,10,5,2,1};
        int[] notes_count = new int[notes.length];
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter A number for change");
        int num = scr.nextInt();

        for (int i = 0; i < notes.length; i++) {
            if (num >= notes[i]) {
                notes_count[i] = num / notes[i];
                num = num % notes[i];
            }
        }

        System.out.println("Currency Count :");
        for (int i = 0; i < notes.length; i++) {
            if (notes_count[i] != 0) {
                System.out.println(notes[i] + " : " + notes_count[i]);
            }
        }
    }
}
