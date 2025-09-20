import java.util.ArrayList;

// Product class
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Order class (aggregates products)
class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<>();
    Customer customer;

    Order(int id, Customer c) {
        this.orderId = id;
        this.customer = c;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId + " by " + customer.name);
        for (Product p : products) {
            System.out.println("- " + p.name + " $" + p.price);
        }
    }
}

// Customer class
class Customer {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    Customer(String name) { this.name = name; }

    void placeOrder(Order o) {
        orders.add(o);
    }

    void showOrders() {
        System.out.println("\nCustomer: " + name + " placed orders:");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class EcommerceDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        Product p1 = new Product("Laptop", 1000);
        Product p2 = new Product("Phone", 500);

        Order o1 = new Order(1, c1);
        o1.addProduct(p1);
        o1.addProduct(p2);

        c1.placeOrder(o1);

        c1.showOrders();
    }
}
