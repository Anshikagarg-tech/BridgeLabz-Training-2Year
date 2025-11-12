import java.util.*;

abstract class CourseType { String name; CourseType(String n){ name = n; } }
class ExamCourse extends CourseType { ExamCourse(String n){ super(n); } }
class AssignmentCourse extends CourseType { AssignmentCourse(String n){ super(n); } }
class ResearchCourse extends CourseType { ResearchCourse(String n){ super(n); } }

class Course<T extends CourseType> {
    T courseType;
    Course(T courseType){ this.courseType = courseType; }
    void showCourse(){ System.out.println("Course: " + courseType.name); }
}

class University {
    static void printCourses(List<? extends CourseType> list) {
        for (CourseType c : list)
            System.out.println("Course Type: " + c.name);
    }

    public static void main(String[] args) {
        List<ExamCourse> exams = Arrays.asList(new ExamCourse("Math Exam"));
        List<AssignmentCourse> assignments = Arrays.asList(new AssignmentCourse("OOP Assignment"));
        printCourses(exams);
        printCourses(assignments);
    }
}
