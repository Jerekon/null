public class masssiv {
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            System.out.println("Список возможных товаров для покупки");

            String[] products = {"Молоко", "Хлеб", "Гречневая крупа"};
            int[] prices = {50, 14, 80};

            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
            }

            Scanner scanner = new Scanner(System.in);
            int sumProducts = 0;
            int[] totalCount = new int[3];

            while (true) {
                System.out.println("Выберите товар и количество или введите `end`");
                String enter = scanner.nextLine();
                if (enter.equals("end")) {
                    for (int i = 0; i < 3; i++) {
                        if (totalCount[i] != 0) {
                            System.out.println(products[i] + " " + totalCount[i] + " шт " +
                                    prices[i] + " руб/шт " + totalCount[i] * prices[i] +
                                    " руб в сумме");
                        }
                        sumProducts += totalCount[i] * prices[i];
                    }
                    System.out.println("Итого " + sumProducts + " рублей");
                    break;
                }
                String[] parts = enter.split(" ");
                int productNumber = Integer.parseInt(parts[0]) - 1;
                int productCount = Integer.parseInt(parts[1]);

                totalCount[productNumber] += productCount;
            }
        }
    }
}
