package com.bridgelabz.Day10.AddressBook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AddressBook ab = new AddressBook();
        Scanner scr = new Scanner(System.in);
        ab.addContact(1,scr);
        System.out.println("Please enter First name to delete");
        String str = scr.next();
        ab.deleteContact(str);

    }

}
