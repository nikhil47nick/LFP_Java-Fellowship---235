package com.bridgelabz.Day11_12.Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Account ac = new Account(10000.0);
        ac.credit(scr);
        ac.debit(scr);
        scr.close();
        System.out.println("Account Balance is : "+ac.accountBalance());
    }

}
