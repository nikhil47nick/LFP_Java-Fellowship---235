package com.bridgelabz.Day7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TicTacToe tik = new TicTacToe();
        Scanner scr = new Scanner(System.in);
        tik.play(scr);
        tik.again(scr);
    }
}
