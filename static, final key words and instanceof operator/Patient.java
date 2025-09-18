package program.samples;

public class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID; // final
        this.name = name; // this
        this.age = age; // this
        this.ailment = ailment; // this
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("PatientID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("P1001", "Rohit", 30, "Fever");
        Patient p2 = new Patient("P1002", "Anshika", 25, "Cold");

        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();
    }
}
