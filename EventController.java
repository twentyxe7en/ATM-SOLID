package atm;
import java.util.Scanner;

public class EventController {
    public void playEvent() {
        Scanner in = new Scanner(System.in);
        Process p = new Process();
        Account acc = new Account();
        Authentication auth = new Authentication();
        
        int looper = 1;
        while (looper > 0) {
            System.out.println("Please Log In");
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Key: ");
            int key = in.nextInt();
            while (auth.login(id, key, acc.getId(), acc.getKey())) {
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
                        System.out.println("Your Savings: " + acc.getSavings());
                        break;
                    case 2:
                        System.out.println("Deposit to Savings");
                        System.out.print("Enter deposit amount: ");
                        p.deposit(in.nextDouble(), id, key, acc.getId(), acc.getKey(), acc.getSavings());
                        System.out.println("Your Savings: " + acc.getSavings());
                        break;
                    case 3:
                        System.out.println("Withdraw from Savings");
                        System.out.print("Enter withdraw amount: ");
                        p.withdraw(in.nextDouble(), id, key, acc.getId(), acc.getKey(), acc.getSavings());
                        System.out.println("Your Savings: " + acc.getSavings());
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
