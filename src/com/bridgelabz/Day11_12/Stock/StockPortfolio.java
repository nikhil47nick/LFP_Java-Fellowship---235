package com.bridgelabz.Day11_12.Stock;

import java.util.Scanner;

public class StockPortfolio {
    private Stock [] stocks;

    public StockPortfolio(Scanner scr) {
        System.out.println("Please Enter number of stocks");
        stocks = new Stock [scr.nextInt()];

    }

    public void StockPortfolio(Scanner scr) {
        for (int i = 0; i < stocks.length; i++) {

            System.out.println("Stock's name:");
            String stockName = scr.next();

            System.out.println("Stock's price:");
            int stockPrice = scr.nextInt();

            System.out.println("Numbers of shares: ");
            int numberShares = scr.nextInt();

            stocks[i] = new Stock(stockName, stockPrice, numberShares);
        }

    }

    public void displayStock(){
        int total=0;
        for (int i = 0; i < stocks.length; i++) {
            int tot = stocks[i].getNumberOfShares() * stocks[i].getPrice();
            System.out.println("Total Stocks are");
            System.out.println("Stock Name: "+stocks[i].getCompanyName());
            System.out.println("Number of: "+stocks[i].getNumberOfShares());
            System.out.println("Price: "+stocks[i].getPrice());
            System.out.println("Total value of stock: "+tot);
            total = total+tot;
        }

        System.out.println("Total Stock value: "+total);
    }

}
