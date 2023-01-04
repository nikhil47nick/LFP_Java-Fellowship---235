package com.bridgelabz.Day11_12.Stock;

import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner scr = new Scanner(System.in);
        StockPortfolio sp = new StockPortfolio(scr);
        sp.StockPortfolio(scr);
        sp.displayStock();
        scr.close();
    }

}
