package com.bridgelabz.Day11_12.Stock;

public class Stock {

    private String companyName;
    private int price;
    private int numberOfShares;

    public String getCompanyName() {
        return companyName;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public Stock(String companyName, int price, int numberOfShares) {
        super();
        this.companyName = companyName;
        this.price = price;
        this.numberOfShares = numberOfShares;
    }

}
