package atm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Process p = new Process();
        Account acc_1 = new Account(1, 6364);
        Authentication auth = new Authentication();
        
        int looper = 1;
        while (looper > 0) {
            System.out.println("Please Log In");
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Key: ");
            int key = in.nextInt();
            while (auth.login(id, key, acc_1.getId(), acc_1.getKey())) {
                System.out.println("======================");
                System.out.println("[1] View Savings");
                System.out.println("[2] Deposit to Savings");
                System.out.println("[3] Withdraw Savings");
                System.out.println("[0] Exit");
                System.out.println("======================");
                int action = in.nextInt();
                switch (action) {
                    case 1:
                        System.out.println("View Savings");
                        System.out.println("Your Savings: " + acc_1.getSavings());
                        break;
                    case 2:
                        System.out.println("Deposit to Savings");
                        System.out.print("Enter deposit amount: ");
                        acc_1.setSavings(p.deposit(in.nextDouble(), acc_1.getSavings()));
                        System.out.println("Your Savings: " + acc_1.getSavings());
                        break;
                    case 3:
                        System.out.println("Withdraw to Savings");
                        System.out.print("Enter withdraw amount: ");
                        acc_1.setSavings(p.withdraw(in.nextDouble(), acc_1.getSavings()));
                        System.out.println("Your Savings: " + acc_1.getSavings());
                        break;
                    case 0:
                        System.out.println("Exiting program.");
                        System.exit(0);
                        break;
                    default:
                        looper++;
                }
            }
        }
    }
}
