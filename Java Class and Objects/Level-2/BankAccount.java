package program.basics;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Anshika", 123456789, 5000);

        acc.displayBalance();
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.withdraw(5000);
    }
}
