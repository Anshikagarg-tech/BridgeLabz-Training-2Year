public class BankLimit {
    public static double getRemainingLimit(Double limit, double withdrawn) {
        if (limit == null) return 0.0;  // null check (wrapper object can be null)
        return limit - withdrawn;       // auto-unboxing done here
    }

    public static void main(String[] args) {
        System.out.println(getRemainingLimit(5000.0, 700));
        System.out.println(getRemainingLimit(null, 300));
    }
}
