package program.banking_system;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA1001", "Anshika", 10000, 4.5);
        BankAccount acc2 = new CurrentAccount("CA2001", "Rohit", 20000, 5000);

        acc1.displayDetails();
        acc2.displayDetails();

        System.out.println("Interest for " + acc1.getHolderName() + ": ₹" + acc1.calculateInterest());
        System.out.println("Interest for " + acc2.getHolderName() + ": ₹" + acc2.calculateInterest());

        // Loan checks
        Loanable loan1 = (Loanable) acc1;
        Loanable loan2 = (Loanable) acc2;

        loan1.applyForLoan(50000);
        System.out.println("Loan Eligibility (Savings): " + loan1.calculateLoanEligibility());

        loan2.applyForLoan(100000);
        System.out.println("Loan Eligibility (Current): " + loan2.calculateLoanEligibility());
    }
}
