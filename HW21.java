package HomeWorks.HWforLesson17;

import java.util.Scanner;

public class HW21 {
    public static void main(String[] args) {

        Order order = new Order();
        int result = askIngredients(order);
        if (result != 4) {
            askIngredients(order);
        }
        System.out.println("You ordered the burger $50 ");
        if (order.hasExtraIngredients()) {
            System.out.println("Extra ingredients:");
        }
        for (Ingredient k : order.getIngredients()) {
            System.out.println(k.getName() + " - $" + k.getPrice());
        }
        System.out.println("Your total price is $" + order.getTotalPrice() + ".");

    }

    public static int askIngredients(Order order) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to add extra ingredients? Please, choose: 1 - sauce $10; 2 - cheese $20; 3 - meet $30.");
        String answer = scanner.nextLine(); //not int

        if (answer.equals("1") || answer.equals("sauce")) {
            order.addIngredient(new Ingredient("sauce", 10));

            return 1;
        }

        if (answer.equals("2") || answer.equals("cheese")) {
            order.addIngredient(new Ingredient("cheese", 20));

            return 2;
        }

        if (answer.equals("3") || answer.equals("meet")) {
            order.addIngredient(new Ingredient("meet", 30));

            return 3;
        }

        return 4;

    }


}
