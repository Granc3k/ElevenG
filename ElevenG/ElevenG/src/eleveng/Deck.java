package eleveng;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Card> deck = new ArrayList<>();
    int value;
    String symbol;
    String number;

    public ArrayList<Card> generateDeck() {
        for (int i = 1; i <= 13; i++) {
            value = i;
            switch (value) {
                case 1:
                    number = "A";
                    break;
                case 11:
                    number = "J";
                    value = 0;
                    break;
                case 12:
                    number = "Q";
                    value = 0;
                    break;
                case 13:
                    number = "K";
                    value = 0;
                    break;
                default:
                    number = String.valueOf(value);
            }
            symbol = "♣";
            Card card = new Card(number, symbol, value);
            deck.add(card);

            symbol = "♦";
            card = new Card(number, symbol, value);
            deck.add(card);

            symbol = "♥";
            card = new Card(number, symbol, value);
            deck.add(card);

            symbol = "♠";
            card = new Card(number, symbol, value);
            deck.add(card);
        }
        Collections.shuffle(deck);
        return deck;
    }
}
