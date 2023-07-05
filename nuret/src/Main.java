import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an operation and enter its number");

        System.out.println("Add earnings:");
        int earnings = scanner.nextInt();

        System.out.println("Add spendings:");
        int spendings = scanner.nextInt();

        String input;
        while (true) {

            input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

        }
        System.out.println("Program end!");

        int operation = Integer.parseInt(input);
        switch (operation) {
            case 1:
                System.out.println("Add earnings:");
                String moneyStr = scanner.nextLine();
                int money = Integer.parseInt(moneyStr);
                earnings += money;
                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("There is no such operation");

                int taxEarningsMinusSpendings;
            {
                int tax = (earnings - spendings) * 15 / 100;
                if (tax >= 0) {
                } else {

                    return;
                }
            }
        }
    }