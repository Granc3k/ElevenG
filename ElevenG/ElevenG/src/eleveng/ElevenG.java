package eleveng;

import java.util.ArrayList;
import java.util.Scanner;

public class ElevenG {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*****WELCOME TO ELEVEN GAME*****");
        Board board = new Board();

        boolean condition = true;
        while (condition) {
            ArrayList<Card> cardsOnBoard = board.Board();
            for (int i = 0; i < cardsOnBoard.size(); i++) {
                Card card = cardsOnBoard.get(i);
                card.toString();
                System.out.println(i + 1 + " - " + card);
            }
            checkPlayability check = new checkPlayability();
            condition = check.checkPlayability(cardsOnBoard, condition);
            if (!condition) {
                break;
            }
            removeCards rm = new removeCards(sc, cardsOnBoard);
        }

    }
}
