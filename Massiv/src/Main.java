import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Eggs(box-10pcs)", "Potatoes(Bag-50kg)", "Milk(Bottle-10l)"};
        int[] prices = {65, 1300, 300};
        int sumProducts = 0;
        int[] quantity = new int[3];
        System.out.println("Products fir rest:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + "." + products[i] + " " + prices[i] + " Money/piece.");
        }

        while (true) {
            System.out.println("Chose item and its count 'end'");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            String[] parts = input.split(" ");
            if (Integer.parseInt(parts[0]) <= products.length && Integer.parseInt(parts[0]) > 0) {
                int productNumber = Integer.parseInt(parts[0]) - 1;
                int productCount = Integer.parseInt(parts[1]);
                quantity[productNumber] = quantity[productNumber] + productCount;

            } else {
                System.out.println("wrong");
            }

        }
        System.out.println("Your box: ");
        for (int i = 0; i < products.length; i++) {
            if (quantity[i] > 0) {
                System.out.println(products[i] + " " + quantity[i] + " pss " + prices[i] + " rub/piece " + (prices[i] * quantity[i]) + " rub summ.");
            }
            sumProducts = sumProducts + (prices[i] * quantity[i]);
        }
        System.out.println("Final " + sumProducts + " rub");

    }
}
