public class SensorData {
    public static void log(double value) {
        Double boxed = value;  // auto-boxing
        System.out.println("Logged (boxed) = " + boxed);
    }

    public static void log(Double value) {
        double unboxed = value; // auto-unboxing
        System.out.println("Logged (unboxed) = " + unboxed);
    }

    public static void main(String[] args) {
        log(36.6);                // primitive
        log(Double.valueOf(37.5)); // wrapper
    }
}
