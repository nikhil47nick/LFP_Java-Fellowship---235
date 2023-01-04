package com.bridgelabz.Day9.AddressBook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AddressBook ab = new AddressBook();
        Scanner scr = new Scanner(System.in);
        ab.addContact(1,scr);
        System.out.println("Please enter name to delete");
        for (int i = 1;i<10;i++){
            if(ab.addressbook[i][0].equalsIgnoreCase(scr.next())){
                ab.deleteContact(i);
            }
        }
    }

}
