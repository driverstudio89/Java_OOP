package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dimensions = getPosition(scanner.nextLine());
        int x = dimensions[0];
        int y = dimensions[1];

        int[][] matrix = new int[x][y];

        fillMatrix(x, y, matrix);

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jedi = getPosition(command);
            int[] evil = getPosition(scanner.nextLine());

            int evilRow = evil[0];
            int evilCol = evil[1];

            while (evilRow >= 0 && evilCol >= 0) {
                if (isInside(matrix, evilRow, evilCol)) {
                    matrix[evilRow][evilCol] = 0;
                }
                evilRow--;
                evilCol--;
            }

            int jediRow = jedi[0];
            int jediCow = jedi[1];

            while (jediRow >= 0 && jediCow < matrix[1].length) {
                if (isInside(matrix, jediRow, jediCow)) {
                    sum += matrix[jediRow][jediCow];
                }

                jediCow++;
                jediRow--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static boolean isInside(int[][] matrix,int row,int cow) {
        return row >= 0 && row < matrix.length && cow >= 0 && cow < matrix[0].length;
    }

    private static int[] getPosition(String command) {

        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillMatrix(int x, int y, int[][] matrix) {

        int value = 0;
        for (int row = 0; row < x; row++) {
            for (int cow = 0; cow < y; cow++) {
                matrix[row][cow] = value++;
            }
        }
    }
}
