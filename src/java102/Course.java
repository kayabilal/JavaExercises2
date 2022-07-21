package java102;

public class Course {
    private String courseName;
    private String code;
    private Instructorr instructor;


    public Course(String courseName, String code, Instructorr instructor){
        this.courseName=courseName;
        this.code=code;
        this.instructor=instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instructorr getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructorr instructor) {
        this.instructor = instructor;
    }

    public double calcAverage(Student[] students){
        double total=0.0;
        for(Student student:students){
            total +=student.getNote();
        }
        return total/students.length;
    }
}
