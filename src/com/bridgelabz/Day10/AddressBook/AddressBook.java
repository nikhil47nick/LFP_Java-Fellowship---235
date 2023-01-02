package com.bridgelabz.Day10.AddressBook;

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

    public void addContact(int num, Scanner scr){

        for (int i=0;i<8;i++)
        {
            System.out.println("Enter "+addressbook[0][i]);
            addressbook[num][i] = scr.next();
        }
    }

    public void deleteContact(String str){
        for (int i = 1;i<10;i++){
            if(addressbook[i][0].equalsIgnoreCase(str)){
                for (int j = 0;j<8;j++) {
                    addressbook[i][j] =null;
                }
            }
        }


    }
    public static void editContact(int pos,Scanner scr){
        System.out.println("Please Enter a number to edit details \n 0-First Name \n 1-Last Name \n 2-address \n 3-city \n 4-state \n 5-zip \n 6-phone number \n7-email" );
        int num = scr.nextInt();
        System.out.println("Please enter updates details");
        addressbook[pos][num] = scr.next();
    }

}
