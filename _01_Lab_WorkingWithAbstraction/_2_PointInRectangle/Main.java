package _01_Lab_WorkingWithAbstraction._2_PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Point bottomLeftPoint = new Point(tokens[0],tokens[1]);
        Point topRightPoint = new Point(tokens[2],tokens[3]);

        Rectangle rectangle = new Rectangle(bottomLeftPoint, topRightPoint);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Point point = new Point(coordinates[0], coordinates[1]);
            System.out.println(rectangle.contains(point));
        }



    }
}
