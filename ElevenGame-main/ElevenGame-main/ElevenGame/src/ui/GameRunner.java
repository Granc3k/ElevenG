package ui;

import sodomka.Card;
import sodomka.Deck;

/**
 * Runs GUI or ConsolaUI
 */
public class GameRunner {

    public static void main(String[] args) {

        Card[] deck = Deck.generateDeck();
        Card[] temp1 = Deck.getStartingCards();
        Card temp2 = Deck.getCard();
        // for (int i = 0; i < deck.length; i++) {
        // System.out.println(deck[i].toString());
        // }
        System.out.println("výpis 9 základních karet");
        for (int ii = 0; ii < temp1.length; ii++) {
            System.out.println(temp1[ii].toString());
        }
        System.out.println("výpis karty z balíčku");
        System.out.println(temp2.toString());
    }
}
