package _02_Exercises_WorkingWithAbstraction._2_CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CardRanks[] cardRanks = CardRanks.values();

        String input = scanner.nextLine();

        if ("Card Ranks".equals(input)) {
            System.out.println("Card Ranks:");
            for (CardRanks cardRank : cardRanks) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
            }
        }


    }
}
