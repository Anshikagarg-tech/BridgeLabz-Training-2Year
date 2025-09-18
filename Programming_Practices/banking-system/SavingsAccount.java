package program.banking_system;

public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan request of ₹" + amount + " received for Savings Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }

    @Override
    public String toString() {
        return "SavingsAccount -> " + getHolderName() + " | Balance: ₹" + getBalance();
    }
}
