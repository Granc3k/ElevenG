package eleveng;

import static eleveng.ElevenG.sc;
import java.util.ArrayList;
import java.util.Scanner;
public class removeCards {

    public removeCards(Scanner sc, ArrayList<Card> cardsOnBoard) {
        System.out.println("Vyberte čísla karet k odstranění:");
        boolean podminka = false;
        while (podminka == false) {
            int choice1 = sc.nextInt();
            int choice2 = sc.nextInt();
            while (1 > choice1 || choice1 > 9 || 1 > choice2 || choice2 > 9) {
                System.out.println("Karty mají čísla 1 až 9. Zkuste je zadat znova a lépe");
                choice1 = sc.nextInt();
                choice2 = sc.nextInt();
            }
            Card card1 = cardsOnBoard.get((choice1) - 1);
            Card card2 = cardsOnBoard.get((choice2) - 1);
            if (choice1 > choice2) {
                int x = choice2;
                choice2 = choice1;
                choice1 = x;
            }
            if (card1.getValue() + card2.getValue() == 0) {
                int choice3 = sc.nextInt();
                while (1 > choice3 || choice3 > 9) {
                    System.out.println("Karty mají čísla 1 až 9. Vyberte tu třetí znova a správně");
                    choice3 = sc.nextInt();
                }
                Card card3 = cardsOnBoard.get((choice3) - 1);
                if (choice2 > choice3) {
                    int x = choice3;
                    choice3 = choice2;
                    choice2 = x;
                    if (choice1 > choice2) {
                        x = choice2;
                        choice2 = choice1;
                        choice1 = x;
                    }
                }
                if (card1.getValue() + card2.getValue() + card3.getValue() == 0
                        && !card1.getNumber().equals(card2.getNumber())
                        && !card2.getNumber().equals(card3.getNumber())
                        && !card1.getNumber().equals(card3.getNumber())) {
                    cardsOnBoard.remove((choice1) - 1);
                    cardsOnBoard.remove((choice2) - 2);
                    cardsOnBoard.remove((choice3) - 3);
                    podminka = true;
                } else {
                    System.out.println("To nebude správná kombinace. Zkuste to znova.");
                }
            } else if (card1.getValue() + card2.getValue() == 11) {
                cardsOnBoard.remove((choice1) - 1);
                cardsOnBoard.remove((choice2) - 2);
                podminka = true;
            } else {
                System.out.println("To nebude správná kombinace. Zkuste to znova.");
                sc.nextLine();
            }
        }
    }
}
