package com.bridgelabz.Day5;

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double w;
        if (Math.abs(t) < 50 && Math.abs(t) > 0) {

        if (Math.abs(v) > 120 || Math.abs(v) < 3 ){
        w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
        System.out.println("Wind Chill"+w);
    }
        }
    }
}
