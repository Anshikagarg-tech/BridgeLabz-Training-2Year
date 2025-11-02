import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        String prices[] = {"250", "499", "99", "abc", "150"};
        int total = 0;

        for(String p : prices) {
            try {
                total += Integer.parseInt(p); // string → int
            } catch(NumberFormatException e) {
                System.out.println("Invalid price skipped: " + p);
            }
        }
        System.out.println("Total Price = " + total);
    }
}

