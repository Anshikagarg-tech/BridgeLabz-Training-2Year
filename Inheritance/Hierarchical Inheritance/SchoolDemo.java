// Base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name + " | Age: " + age);
    }

    void displayRole() {
        System.out.println("Generic Person");
    }
}

// Subclass - Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Teacher | Subject: " + subject);
    }
}

// Subclass - Student
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student | Grade: " + grade);
    }
}

// Subclass - Staff
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Staff | Department: " + department);
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s1 = new Student("Ananya", 16, "10th Grade");
        Staff st1 = new Staff("Rajesh", 35, "Administration");

        t1.displayPerson();
        t1.displayRole();
        System.out.println("-----------------------");

        s1.displayPerson();
        s1.displayRole();
        System.out.println("-----------------------");

        st1.displayPerson();
        st1.displayRole();
    }
}
