import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("ACC101", 10000.0);
        accounts.put("ACC102", 5000.0);
        accounts.put("ACC103", 25000.0);
        accounts.put("ACC104", 15000.0);

        // Deposit
        accounts.put("ACC102", accounts.get("ACC102") + 3000);

        // Withdraw
        double withdrawAmt = 20000;
        String acc = "ACC103";
        if (withdrawAmt <= accounts.get(acc))
            accounts.put(acc, accounts.get(acc) - withdrawAmt);
        else
            System.out.println("Insufficient Balance for " + acc);

        // Sort by balance desc
        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\nAccounts (by balance):");
        for (Map.Entry<String, Double> e : list)
            System.out.println(e.getKey() + " -> " + e.getValue());

        System.out.println("\nTop 3 Customers:");
        for (int i = 0; i < Math.min(3, list.size()); i++)
            System.out.println(list.get(i).getKey() + " -> " + list.get(i).getValue());
    }
}
