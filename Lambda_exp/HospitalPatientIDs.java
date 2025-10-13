import java.util.*;

public class HospitalPatientIDs {
    public static void main(String[] args) {
        List<Integer> patientIds = Arrays.asList(101, 102, 103, 104, 105);

        // Using method reference instead of lambda
        patientIds.forEach(System.out::println);
    }
}
