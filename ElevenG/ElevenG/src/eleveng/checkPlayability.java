package eleveng;

import java.util.ArrayList;

public class checkPlayability {

    public boolean checkPlayability(ArrayList<Card> cardsOnBoard, boolean condition) {

        condition = false;
        if (cardsOnBoard.size() < 3) {
            condition = true;
        } else {
            for (int i = 0; i < cardsOnBoard.size(); i++) {
                for (int j = i + 1; j < cardsOnBoard.size(); j++) {
                    for (int k = i + 2; k < cardsOnBoard.size(); k++) {
                        Card card1 = cardsOnBoard.get(i);
                        Card card2 = cardsOnBoard.get(j);
                        if (card1.getValue() + card2.getValue() == 11) {
                            condition = true;
                        }
                        Card card3 = cardsOnBoard.get(k);
                        if (card1.getValue() + card2.getValue() + card3.getValue() == 0
                                && !card1.getNumber().equals(card2.getNumber())
                                && !card2.getNumber().equals(card3.getNumber())
                                && !card1.getNumber().equals(card3.getNumber())) {
                            condition = true;

                        }
                    }
                }
            }
        }

        if (!condition) {
            System.out.println("GAME OVER");

        }
        if (cardsOnBoard.size() == 0) {
            System.out.println("YOU WIN!");
            condition = false;
        }
        return condition;
    }
}
