package program.practice;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setBalance(double balance) { this.balance = balance; }
    public double getBalance() { return balance; }

    public void displayAccountDetails() {
        System.out.println("Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsDetails() {
        System.out.println("Savings Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance());
    }
}

class MainBank {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("S101", "Rohit", 10000);
        ba.displayAccountDetails();

        SavingsAccount sa = new SavingsAccount("S102", "Anshika", 20000);
        sa.displaySavingsDetails();
    }
}
