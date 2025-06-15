import java.util.ArrayList;
import java.util.Scanner;

class Transaction {
    String type;
    double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    //@Override
    public String toString() {
        return type + ": ₹" + amount;
    }
}

class Account {
    String name;
    int accountNumber;
    double balance;
    ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Deposit successful!");
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void viewTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }
}

public class BankAccountApp {
    static Scanner sc = new Scanner(System.in);
    static Account account;

    public static void main(String[] args) {
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNum = sc.nextInt();

        System.out.print("Enter initial balance: ₹");
        double balance = sc.nextDouble();

        account = new Account(name, accNum, balance);
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double with = sc.nextDouble();
                    account.withdrawal(with);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.viewTransactions();
                    break;
                case 5:
                    System.out.println("Thank you! Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 5);
    }
}
