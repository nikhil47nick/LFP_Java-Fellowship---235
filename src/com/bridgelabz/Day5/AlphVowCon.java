package com.bridgelabz.Day5;

import java.util.Scanner;

public class AlphVowCon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Single digit number");
    char ch = scn.next().charAt(0);
    int count = 0;
        switch (ch)
    {
        case 'A':count = 1;
            break;
        case 'E':count = 1;
            break;
        case 'I':count = 1;
            break;
        case 'O':count = 1;
            break;
        case 'U':count = 1;
            break;
        case 'a':count = 1;
            break;
        case 'e':count = 1;
            break;
        case 'i':count = 1;
            break;
        case 'o':count = 1;
            break;
        case 'u':count = 1;
            break;
        default:count = 0;
    }
        if(count == 1) {
        System.out.println("Character is Vowel");
    }else{
        System.out.println("Character is Consonant");
    }
}
}
