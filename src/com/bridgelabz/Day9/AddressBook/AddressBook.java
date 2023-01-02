package com.bridgelabz.Day9.AddressBook;

import java.util.Scanner;

public class AddressBook {

    public static String[][] addressbook;

    AddressBook(){
        addressbook = new String[10][8];
        addressbook[0][0]="First Name";
        addressbook[0][1]="Last Name";
        addressbook[0][2]="Address";
        addressbook[0][3]="City";
        addressbook[0][4]="State";
        addressbook[0][5]="Zip";
        addressbook[0][6]="Phone Number";
        addressbook[0][7]="Email";
    }

    public static void addContact(int num, Scanner scr){

        for (int i=0;i<8;i++)
        {
            System.out.println("Enter "+addressbook[0][i]);
            addressbook[num][i] = scr.next();
        }
    }

    public static void deleteContact(int pos){
        for (int i = 0;i<8;i++) {

            addressbook[pos][i] =null;
        }
    }

}
