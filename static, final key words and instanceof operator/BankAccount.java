package program.samples;

public class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName; // using this
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account No: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("SBI001", "Rohit", 5000);
        BankAccount a2 = new BankAccount("SBI002", "Anshika", 10000);

        a1.displayDetails();
        System.out.println("--------");
        a2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
