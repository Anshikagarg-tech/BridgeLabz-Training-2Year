package program.basics;

public class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 50) return 'C';
        else return 'D';
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Anshika", 101, 92);
        Student s2 = new Student("Rohit", 102, 67);

        s1.displayDetails();
        s2.displayDetails();
    }
}

