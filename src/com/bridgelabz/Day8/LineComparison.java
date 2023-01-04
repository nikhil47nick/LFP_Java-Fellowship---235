package com.bridgelabz.Day8;

public class LineComparison {

    public static void compareTo(double length1,double length2){
        Integer n1 = new Integer((int)length1);
        Integer n2 = new Integer((int)length2);
        if (n1.compareTo(n2) >0) {
            System.out.println("Length1 is greater");
        }else if(n1.compareTo(n2) <0){
            System.out.println("Length2 is Greater");
        }else {
            System.out.println("Length is equal");
        }
    }


    public static void main(String[] args){


        double length1= Math.sqrt( Math.pow((3 - 2), 2) + Math.pow((7 - 6),2));
        double length2= Math.sqrt( Math.pow((1 - 2), 2) + Math.pow((8 - 6),2));

        compareTo(length1,length2);

    }
}
