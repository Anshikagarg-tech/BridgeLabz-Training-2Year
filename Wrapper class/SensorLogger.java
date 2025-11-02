public class SensorLogger {
    public static void log(double tempPrimitive) {
        Double tempObj = tempPrimitive; // auto-boxing
        System.out.println("Recorded (Double): " + tempObj);
    }

    public static void log(Double tempObject) {
        double tempPrimitive = tempObject; // auto-unboxing
        System.out.println("Recorded (primitive): " + tempPrimitive);
    }

    public static void main(String[] args) {
        log(36.5);      // primitive input
        log(Double.valueOf(37.2)); // wrapper input
    }
}
