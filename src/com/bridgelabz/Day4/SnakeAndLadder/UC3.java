package com.bridgelabz.Day4.SnakeAndLadder;

public class UC3 {

    public static final int ladder=1,snake=2;

    public static void main(String[] args){
        int player1Pos = 0;
        int dice = (int)(Math.random()*6+1);
        int play = (int)(Math.random()*2);
        switch(play){
        case ladder:player1Pos=player1Pos+dice;
        break;
        case snake:player1Pos=player1Pos-dice;
        break;
        default: break;
        }
        System.out.println("Player Position : "+player1Pos);
    }
}
