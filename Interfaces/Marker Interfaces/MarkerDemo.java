interface SensitiveData { }  // Marker Interface

class UserCredentials implements SensitiveData {
    String username = "admin";
    String password = "1234@abc";
}

public class MarkerDemo {
    public static void main(String[] args) {
        UserCredentials user = new UserCredentials();
        if (user instanceof SensitiveData)
            System.out.println("Sensitive data — should be encrypted.");
    }
}
