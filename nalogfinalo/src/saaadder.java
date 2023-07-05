import java.util.Scanner;

class saaadder {
    public static int taxEarnings(int earnings) {
        return (earnings * 6) / 100;
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax =(earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;

        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Enter a new income");
            System.out.println("2. Add a new expense");
            System.out.println("3. Chose a tax system");

            String enter = sc.nextLine();
            if ("end".equals(enter)) {
                System.out.println(" ");
                System.out.println("The program is completed");
                break;
            }

            int input = Integer.parseInt(enter);


            switch (input) {

                case 1:
                    System.out.println("Enter a new income:");
                    String moneyStr = sc.nextLine();
                    System.out.println(" ");
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;

                case 2:
                    System.out.println("Add a new expense:");
                    String spendStr = sc.nextLine();
                    System.out.println(" ");
                    int spend = Integer.parseInt(spendStr);
                    spendings += spend;
                    break;
                case 3:
                    System.out.println(" ");
                    if (taxEarnings(earnings) < taxEarningsMinusSpendings(earnings, spendings)) {
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: " + taxEarnings(earnings) + " рублей");
                        System.out.println("Налог на другой системе: " + taxEarningsMinusSpendings(earnings, spendings) + " рублей");
                        System.out.println("Экономия: " + (taxEarningsMinusSpendings(earnings, spendings) - taxEarnings(earnings)) + " рублей");
                    } else {
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: " + taxEarningsMinusSpendings(earnings, spendings) + " рублей");
                        System.out.println("Налог на другой системе: " + taxEarnings(earnings) + " рублей");
                        System.out.println("Экономия: " + (taxEarnings(earnings) - taxEarningsMinusSpendings(earnings, spendings)) + " рублей");
                        System.out.println(" ");
                    }
                    break;
                default:
                    System.out.println("Такой операции нет!");
                    System.out.println(" ");
            }
        }
    }
}