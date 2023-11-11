package Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!"Beast!".equals(input)) {
            try {
                switch (input) {
                    case "Dog":
                        String[] tokens = scanner.nextLine().split("\\s+");
                        Dog dog = new Dog(tokens[0],Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(dog);
                        break;
                    case "Frog":
                        tokens = scanner.nextLine().split("\\s+");
                        Frog frog = new Frog(tokens[0],Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(frog);
                        break;
                    case "Cat":
                        tokens = scanner.nextLine().split("\\s+");
                        Cat cat = new Cat(tokens[0],Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(cat);
                        break;
                    case "Kitten":
                        tokens = scanner.nextLine().split("\\s+");
                        Kitten kitten = new Kitten(tokens[0],Integer.parseInt(tokens[1]));
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        tokens = scanner.nextLine().split("\\s+");
                        Tomcat tomcat = new Tomcat(tokens[0],Integer.parseInt(tokens[1]));
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            input = scanner.nextLine();
        }


    }
}
