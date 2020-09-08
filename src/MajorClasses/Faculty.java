package MajorClasses;
import CompositionClasses.PhoneNumber;

public class Faculty extends Person {
    private Course courseWithThisInstructor;

    public Faculty(String name, String address, PhoneNumber phoneNumber, String emailAddress, Course courseWithThisInstructor) {
        super(name, address, phoneNumber, emailAddress);
        this.courseWithThisInstructor = courseWithThisInstructor;
    }


    public Course getCourseWithThisInstructor() {
        return courseWithThisInstructor;
    }

    public void setCourseWithThisInstructor(Course courseWithThisInstructor) {
        this.courseWithThisInstructor = courseWithThisInstructor;
    }


    public String toString() {
        return String.format("%s%n%s%n",super.toString(),getCourseWithThisInstructor());
    }
}
