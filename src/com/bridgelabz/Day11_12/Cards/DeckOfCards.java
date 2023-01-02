package com.bridgelabz.Day11_12.Cards;

import java.util.Random;

public class DeckOfCards {
   String[][] deck;




    DeckOfCards(){
        deck =new String[][] {{"Clubs", "Diamonds", "Hearts", "Spades"},{"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"}};

    }

    public void shuffle(){


        for(int i = 0; i < deck.length; i++) {
            for(int j = 0; j < deck[i].length; j++) {

                int cardLucky = (int)(Math.random()*13) + 1;
                int suitLucky = (int)(Math.random()*4) + 1;

                System.out.print(deck[cardLucky][suitLucky]);

            }
        }
    }





}

