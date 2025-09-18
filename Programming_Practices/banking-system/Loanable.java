package program.banking_system;

public interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
