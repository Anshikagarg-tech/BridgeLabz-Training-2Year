// Base class
class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourse() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + " weeks");
    }
}

// Subclass of Course
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourse() {
        super.displayCourse();
        System.out.println("Platform: " + platform + " | Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass of OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // in %

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayCourse() {
        super.displayCourse();
        System.out.println("Fee: $" + fee + " | Discount: " + discount + "% | Final Fee: $" + getFinalFee());
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics", 10);
        OnlineCourse c2 = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("AI & ML", 12, "Coursera", true, 500, 20);

        c1.displayCourse();
        System.out.println("-----------------");
        c2.displayCourse();
        System.out.println("-----------------");
        c3.displayCourse();
    }
}
