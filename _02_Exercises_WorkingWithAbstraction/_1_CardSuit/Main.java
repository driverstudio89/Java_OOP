package _02_Exercises_WorkingWithAbstraction._1_CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CardSuits[] cardSuits = CardSuits.values();

        String input = scanner.nextLine();

        if (input.equals("Card Suits")) {
            System.out.println("Card Suits:");
            for (CardSuits cardSuit: cardSuits) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit.name());
            }
        }



    }
}
