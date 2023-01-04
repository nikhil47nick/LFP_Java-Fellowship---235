package com.bridgelabz.Day2;


public class SpringSeason {

    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean seas = false;
            if ( m == 3 && d >= 20 && d <= 31 ) {
                seas = true;
            }
            else if(m == 6 && d <= 20){
                seas = true;
            }else if (m > 3 && m < 6){
                seas = true;
            }else{
                seas = false;
            }


        System.out.println(seas);
    }
}
