package program.practice;

public class Course {
    private String courseName;
    private int duration; // in weeks
    private double fee;
    private static String instituteName = "Tech Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: ₹" + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 8, 10000);
        Course c2 = new Course("Python Programming", 6, 8000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Global Tech Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
