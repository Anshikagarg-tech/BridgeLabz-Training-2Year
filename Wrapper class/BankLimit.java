public class BankLimit {
    public static double remainingLimit(Double limit) {
        if(limit == null) return 0.0; // handle null
        return limit;
    }

    public static void main(String[] args) {
        Double limit1 = 5000.0;
        Double limit2 = null;

        System.out.println(remainingLimit(limit1));
        System.out.println(remainingLimit(limit2));
    }
}
