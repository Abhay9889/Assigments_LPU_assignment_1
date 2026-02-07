import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;

        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(balance);
                    break;
                case 2:
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println(balance);
                    break;
                case 3:
                    int withdraw = sc.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println(balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
