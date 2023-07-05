import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("what we need");

        String[] products = {"Bred", "Sugar", "Rise"};
        int[] prices = {46, 72, 43};

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " rub/piece");
        }

        Scanner scanner = new Scanner(System.in);
        int sumProducts = 0;
        int[] totalCount = new int[3];

        while (true) {
            System.out.println("Chose item and its count `end`");
            String enter = scanner.nextLine();
            if (enter.equals("end")) {
                for (int i = 0; i < 3; i++) {
                    if (totalCount[i] != 0) {
                        System.out.println(products[i] + " " + totalCount[i] + " шт " +
                                prices[i] + " rub/pice " + totalCount[i] * prices[i] +
                                " rub in sum");
                    }
                    sumProducts += totalCount[i] * prices[i];
                }
                System.out.println("Final " + sumProducts + " rubles");
                break;
            }
            String[] parts = enter.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);

            totalCount[productNumber] += productCount;
        }
    }
}