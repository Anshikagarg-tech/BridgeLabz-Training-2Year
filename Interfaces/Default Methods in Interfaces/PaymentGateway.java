interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated (default method).");
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " via PayPal processed.");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor pp = new PayPal();
        pp.processPayment(1200);
        pp.refund(300);
    }
}
