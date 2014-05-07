import java.*;

/**
 * Created by Asher on 5/6/14.
 */
public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Avi Lapin");
        course1.addStudent("Abby Lynn");
        course1.addStudent("Annie Mai Shin");

        course1.addStudent("Daniel Andrade");
        course1.addStudent("Gabee Cendoroglo");

        System.out.println("Number of students in the first course: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();

    }
}

class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public  String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student){
        System.out.println(students[students.indexOf(student)]);
    }
}