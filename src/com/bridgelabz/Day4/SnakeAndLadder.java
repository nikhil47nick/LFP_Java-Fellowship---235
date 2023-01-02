package com.bridgelabz.Day4;

public class SnakeAndLadder {
    public static final int ladder=2,snake=1;

    public static int play(int player){

        int dice = (int)(Math.random()*6+1);
        int play = (int)(Math.random()*2+1);
        switch (play) {
            case ladder:
                if (player + dice >100){
                    dice = 0;
                }else{
                    dice = (dice);
                }
                break;
            case snake:
                if (player -dice < 0) {
                    dice=0;
                }else{
                    dice = (-dice);
                }
                break;
            default: dice = 0;
            break;
        }
        return  dice;
    }

    public static void main(String[] args) {
        int player1Pos = 0;
        int player2Pos = 0;
        int win = 0;
        int count=0;

        while (win == 0) {
            count++;
            player1Pos =player1Pos + play(player1Pos);
            player2Pos =player2Pos + play(player2Pos);

            if (player1Pos == 100){
                win = 1;
                System.out.println("Player 1 Win");
            }else if (player2Pos == 100){
                win = 1;
                System.out.println("Player 2 Win");
            }
        }
        System.out.println("Total count"+count);
    }
}
