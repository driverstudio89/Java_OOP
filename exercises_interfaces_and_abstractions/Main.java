package exercises_interfaces_and_abstractions;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyerMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            if (tokens.length == 4) {
                String id = tokens[2];
                String birthDate = tokens[3];
                Buyer citizen = new Citizen(name, age, id, birthDate);
                buyerMap.put(name, citizen);
            } else if (tokens.length == 3) {
                String group = tokens[2];
                Buyer rebel = new Rebel(name, age, group);
                buyerMap.put(name, rebel);
            }
        }
        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            if (buyerMap.containsKey(input)) {
                buyerMap.get(input).buyFood();
            }
            input = scanner.nextLine();
        }
        int totalFood = 0;
        for (Buyer buyer : buyerMap.values()) {
            totalFood += buyer.getFood();
        }
        System.out.println(totalFood);


    }
}
