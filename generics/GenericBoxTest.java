// Generic Box Class
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

// Test Class
public class GenericBoxTest {
    public static void main(String[] args) {

        // Storing Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer Value: " + intBox.get());

        // Storing String
        Box<String> strBox = new Box<>();
        strBox.set("Hello World");
        System.out.println("String Value: " + strBox.get());

        // Storing Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(15.75);
        System.out.println("Double Value: " + doubleBox.get());
    }
}
