package _01_Lab_WorkingWithAbstraction._1_RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printRhombus(n);
    }

    private static void printRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            printRhombusRow(n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            printRhombusRow(n, i);
        }
    }

    private static void printRhombusRow(int n, int i) {
        for (int j = 0; j < n - i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
