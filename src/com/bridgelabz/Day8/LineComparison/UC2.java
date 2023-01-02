package com.bridgelabz.Day8.LineComparison;

public class UC2 {

    public static void equal(double length1,double length2){
        Integer n1 = new Integer((int)length1);
        Integer n2 = new Integer((int)length2);
        if (n1.equals(n2)) {
            System.out.println("Length is equal");
        }else{
            System.out.println("Length is not equal");
        }
    }


    public static void main(String[] args){


        double length1= Math.sqrt( Math.pow((3 - 2), 2) + Math.pow((7 - 6),2));
        double length2= Math.sqrt( Math.pow((1 - 2), 2) + Math.pow((8 - 6),2));




        equal(length1,length2);


    }
}
