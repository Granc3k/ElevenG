package eleveng;

import java.util.ArrayList;

public class Board {

    Deck myDeck = new Deck();
    ArrayList<Card> deck = myDeck.generateDeck();
    ArrayList<Card> cardsOnBoard = new ArrayList<>();
    int numberOfCards = 9;

    public ArrayList<Card> Board() {
        int i = 0;
        if (cardsOnBoard.size() < numberOfCards && deck.size() > 0) {
            do {
                cardsOnBoard.add(deck.get(i));
                deck.remove(i);
            } while (cardsOnBoard.size() < numberOfCards && deck.size() > 0);
        }
        return cardsOnBoard;
    }

}
