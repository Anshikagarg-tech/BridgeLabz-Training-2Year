package program.hospital_management;

public class Main {
    public static void main(String[] args) {
        InPatient p1 = new InPatient("IP1001", "Riya", 25, 5, 2000);
        OutPatient p2 = new OutPatient("OP2001", "Amit", 30, 500);

        p1.getPatientDetails();
        System.out.println("Bill: ₹" + p1.calculateBill());
        p1.addRecord("Surgery performed");
        p1.viewRecords();

        System.out.println("----------------------");

        p2.getPatientDetails();
        System.out.println("Bill: ₹" + p2.calculateBill());
        p2.addRecord("Consultation only");
        p2.viewRecords();
    }
}
