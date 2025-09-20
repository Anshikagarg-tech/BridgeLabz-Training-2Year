// Base class
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber + " | Balance: $" + balance);
    }

    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

// Subclass - Savings Account
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Savings Account | Interest Rate: " + interestRate + "%");
    }
}

// Subclass - Checking Account
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Checking Account | Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass - Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // in months

    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account | Maturity Period: " + maturityPeriod + " months");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("S101", 5000, 4.5);
        CheckingAccount c1 = new CheckingAccount("C202", 8000, 2000);
        FixedDepositAccount f1 = new FixedDepositAccount("F303", 10000, 12);

        s1.displayDetails();
        s1.displayAccountType();
        System.out.println("-----------------------");

        c1.displayDetails();
        c1.displayAccountType();
        System.out.println("-----------------------");

        f1.displayDetails();
        f1.displayAccountType();
    }
}
