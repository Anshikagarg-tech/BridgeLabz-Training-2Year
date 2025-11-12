import java.util.*;

abstract class JobRole { String role; JobRole(String r){ role = r; } }
class SoftwareEngineer extends JobRole { SoftwareEngineer(){ super("Software Engineer"); } }
class DataScientist extends JobRole { DataScientist(){ super("Data Scientist"); } }
class ProductManager extends JobRole { ProductManager(){ super("Product Manager"); } }

class Resume<T extends JobRole> {
    T job;
    Resume(T job){ this.job = job; }
    void process(){ System.out.println("Processing resume for: " + job.role); }
}

class ResumeScreening {
    static void screenAll(List<? extends JobRole> roles) {
        for(JobRole r : roles)
            System.out.println("Screening for: " + r.role);
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>(new DataScientist());
        r1.process();
        r2.process();

        List<JobRole> jobs = Arrays.asList(new SoftwareEngineer(), new ProductManager());
        screenAll(jobs);
    }
}
