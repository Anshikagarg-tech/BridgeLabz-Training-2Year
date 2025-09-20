import java.util.ArrayList;

// Course class
class Course {
    String name;
    Professor professor;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) { this.name = name; }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to course " + name);
    }

    void enrollStudent(Student s) {
        students.add(s);
        System.out.println("Student " + s.name + " enrolled in " + name);
    }

    void showCourseDetails() {
        System.out.println("\nCourse: " + name);
        System.out.println("Professor: " + (professor != null ? professor.name : "None"));
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

// Student class
class Student {
    String name;
    Student(String name) { this.name = name; }

    void enrollCourse(Course c) {
        c.enrollStudent(this);
    }
}

// Professor class
class Professor {
    String name;
    Professor(String name) { this.name = name; }

    void assignCourse(Course c) {
        c.assignProfessor(this);
    }
}

public class UniversitySystemDemo {
    public static void main(String[] args) {
        Professor p1 = new Professor("Dr. Smith");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Data Structures");

        p1.assignCourse(c1);
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        c1.showCourseDetails();
    }
}
