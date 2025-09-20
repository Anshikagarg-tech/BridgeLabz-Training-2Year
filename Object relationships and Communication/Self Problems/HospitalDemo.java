import java.util.ArrayList;

// Patient class
class Patient {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();

    Patient(String name) { this.name = name; }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void showDoctors() {
        System.out.println("\nPatient: " + name + " consulted with:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.name);
        }
    }
}

// Doctor class
class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) { this.name = name; }

    void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this);
        System.out.println("Dr. " + name + " consulted patient " + p.name);
    }

    void showPatients() {
        System.out.println("\nDr. " + name + " has patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

// Hospital class
class Hospital {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String name) { this.name = name; }

    void addDoctor(Doctor d) { doctors.add(d); }
    void addPatient(Patient p) { patients.add(p); }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Brown");
        Doctor d2 = new Doctor("Taylor");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d2.consult(p1);
        d2.consult(p2);

        d1.showPatients();
        d2.showPatients();

        p1.showDoctors();
        p2.showDoctors();
    }
}
