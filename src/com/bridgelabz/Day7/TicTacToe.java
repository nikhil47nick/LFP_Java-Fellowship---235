package com.bridgelabz.Day7;

import java.util.Scanner;

public class TicTacToe {
    public static final int computer =1,player=2;
   public static char[] board =new char[10];
   char win;

   TicTacToe(){
       for (int i=1;i<=9;i++) {
           this.board[i] = ' ';
       }
   }

    public char playerSelect(Scanner scr){
        System.out.println("Please Enter O or X to choose");
        char p1;
        while(true) {
            p1 = scr.next().charAt(0);
            if(p1 =='O' || p1 =='X'){
                break;
            }else{
                System.out.println("Please Enter O or X to continue");
            }
        }
            return p1;
    }
    public void showBoard(){
        char[] board = this.board;
        System.out.println("_____________");
        System.out.println("| "+board[1]+" | "+board[2]+" | "+board[3]+" |");
        System.out.println("_____________");
        System.out.println("| "+board[4]+" | "+board[5]+" | "+board[6]+" |");
        System.out.println("_____________");
        System.out.println("| "+board[7]+" | "+board[8]+" | "+board[9]+" |");
        System.out.println("_____________");
    }
    public void playerMove(Scanner scr,char ch){

        System.out.println("Please Enter value between 1 to 9 as per the board your move");
        System.out.println("_____________");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("_____________");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("_____________");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("_____________");
        int num = scr.nextInt();
        if(board[num] =='O' || board[num] =='X'){
            System.out.println("Invalid Selection");
            playerMove(scr,ch);
        }else{
            board[num] = ch;
        }
    }
    public int toss(){
        int num = (int)(Math.random()*2+1);
        if (num == 0){
            toss();
        }
        return num;
    }

    public char result(){
        if (board[1]==board[2] && board[2]==board[3] && board[1] !=' '){
            win = board[1];
            return 1;
        }else if (board[4]==board[5] && board[5]==board[6]&& board[4] !=' '){
            win = board[4];
            return 1;
        }else if (board[7]==board[8] && board[8]==board[9]&& board[7] !=' '){
            win = board[7];
            return 1;
        }else if (board[1]==board[4] && board[4]==board[7]&& board[1] !=' '){
            win = board[1];
            return 1;
        }else if (board[2]==board[5] && board[5]==board[8]&& board[2] !=' '){
            win = board[2];
            return 1;
        }else if (board[3]==board[6] && board[6]==board[9]&& board[3] !=' '){
            win = board[3];
            return 1;
        }else if (board[1]==board[5] && board[5]==board[9]&& board[1] !=' '){
            win = board[1];
            return 1;
        }else if (board[3]==board[5] && board[5]==board[7]&& board[3] !=' '){
            win = board[3];
            return 1;
        }else{
            for(int i =1;i<=9;i++){
                if(board[i] ==' '){
                    return 0;
                }
            }
            return 'D';
        }

    }

    public void computerPlayer(char ch){

            if(board[1] == ' ' && board[2]==board[3] || board[4] ==board[7] || board[5]==board[9] ){
                    board[1]=ch;
            }else if(board[2] == ' ' && board[1]==board[3] || board[5] ==board[8] ){
                    board[2]=ch;
            }else if(board[3] == ' ' && board[1]==board[2] || board[6] ==board[9] || board[5]==board[7] ){
                    board[3]=ch;
            }else if(board[4] == ' ' && board[1]==board[7] || board[5] ==board[6]){
                    board[4] = ch;
            }else if(board[5] == ' ' && board[1]==board[9] || board[4] ==board[6] || board[2]==board[8] || board[3]==board[7]){
                        board[5]=ch;
            }else if(board[6] == ' ' && board[3]==board[9] || board[4] ==board[5] ){
                        board[6]=ch;
            }else if(board[7] == ' ' && board[1]==board[4] || board[8] ==board[9] || board[5]==board[3]){
                        board[7]=ch;
            }else if(board[8] == ' ' && board[2]==board[5] || board[7] ==board[9] ){
                        board[8]=ch;
            }else if(board[9] == ' ' && board[3]==board[6] || board[7] ==board[8] || board[1]==board[5] ){
                        board[9]=ch;
            }else if (board[1] == ' '){
                    board[1]=ch;
            }else if (board[3] == ' '){
                    board[3]=ch;
            }else if (board[7] == ' '){
                board[7]=ch;
            }else if (board[9] == ' ' ){
                board[9]=ch;
            }else if (board[5] == ' ' ){
                board[5]=ch;
            }else if (board[2] == ' ' ){
                board[2]=ch;
            }else if (board[4] == ' ' ){
                board[4]=ch;
            }else if (board[6] == ' ' ){
                board[6]=ch;
            }else if (board[8] == ' ' ){
                board[8]=ch;
            }

    }

public void play(Scanner scr){
    char playersel = playerSelect(scr);
    char computersel;
    int turn = toss();
    if(playersel == 'O'){computersel ='X';}else{computersel='O';}
    while(result() != 1){
        if(turn==computer){
            computerPlayer(computersel);
            turn = player;
        }else if(turn==player){
            playerMove(scr,playersel);
            turn = computer;
        }
        if(result()=='D'){
            System.out.println("Draw");
            break;
        }
        showBoard();
    }
    if(playersel == win){
        System.out.println("Player Won the Game");
    }else if (computersel == win){
        System.out.println("Computer Won the Game");
    }

}

public void again(Scanner scr) {
    System.out.println("Press 1 to play again 0 to exit");
    if (scr.nextInt()==1) {
        new TicTacToe();
    }
    }
}
