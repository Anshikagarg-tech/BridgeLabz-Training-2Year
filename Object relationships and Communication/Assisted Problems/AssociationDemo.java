import java.util.ArrayList;

// Bank class
class Bank {
    String bankName;
    ArrayList<Customer> customers;

    Bank(String name) {
        this.bankName = name;
        this.customers = new ArrayList<>();
    }

    void openAccount(Customer c) {
        customers.add(c);
        System.out.println(c.name + " opened an account in " + bankName);
    }

    void showCustomers() {
        System.out.println("\nCustomers of " + bankName + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.name);
        }
    }
}

// Customer class
class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");

        Customer c1 = new Customer("Alice", 5000);
        Customer c2 = new Customer("Bob", 3000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        bank.showCustomers();

        c1.viewBalance();
        c2.viewBalance();
    }
}
