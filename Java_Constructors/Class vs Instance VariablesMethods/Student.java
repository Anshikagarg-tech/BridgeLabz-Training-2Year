package program.practice;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Specialization: " + specialization + ", CGPA: " + getCGPA());
    }
}

class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rohit", 9.1);
        s1.displayStudentDetails();

        PostgraduateStudent pg = new PostgraduateStudent(201, "Anshika", 9.5, "Computer Science");
        pg.displayPGDetails();
    }
}
