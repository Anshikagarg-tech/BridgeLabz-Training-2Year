import java.util.ArrayList;

// Faculty (exists independently → Aggregation)
class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
    void showFaculty() { System.out.println("Faculty: " + name); }
}

// Department (composition → depends on University)
class Department {
    String deptName;
    Department(String deptName) { this.deptName = deptName; }
    void showDept() { System.out.println("Department: " + deptName); }
}

// University (composition with Departments, aggregation with Faculty)
class University {
    String uniName;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String name) { this.uniName = name; }

    void addDepartment(Department d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }

    void showUniversity() {
        System.out.println("\nUniversity: " + uniName);
        for (Department d : departments) d.showDept();
        for (Faculty f : faculties) f.showFaculty();
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University u1 = new University("Tech University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mechanical");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");

        u1.addDepartment(d1);
        u1.addDepartment(d2);

        u1.addFaculty(f1);
        u1.addFaculty(f2);

        u1.showUniversity();

        // Composition effect (University deletion deletes departments)
        u1 = null;
        System.gc(); // Suggest GC
        System.out.println("\nUniversity deleted, departments vanish with it.");
    }
}
