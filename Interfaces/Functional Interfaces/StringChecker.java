import java.util.function.Function;

public class StringChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthFinder = str -> str.length();
        String msg = "Welcome to Java Interface Practice!";
        int len = lengthFinder.apply(msg);
        System.out.println("Message length: " + len);
    }
}
