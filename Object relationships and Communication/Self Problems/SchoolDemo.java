import java.util.ArrayList;

// Course class
class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void enrollStudent(Student s) {
        students.add(s);
    }

    void showEnrolledStudents() {
        System.out.println("\nCourse: " + name + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

// Student class
class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this); // mutual association
    }

    void showCourses() {
        System.out.println("\nStudent: " + name + " enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.name);
        }
    }
}

// School class (Aggregation of Students)
class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.schoolName = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("\nSchool: " + schoolName + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        school.showStudents();
        s1.showCourses();
        s2.showCourses();
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}
