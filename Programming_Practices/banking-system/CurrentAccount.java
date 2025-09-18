package program.banking_system;

public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        // Current accounts usually have no interest
        return 0;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan request of ₹" + amount + " received for Current Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return (getBalance() + overdraftLimit) > 10000;
    }

    @Override
    public String toString() {
        return "CurrentAccount -> " + getHolderName() + " | Balance: ₹" + getBalance();
    }
}
