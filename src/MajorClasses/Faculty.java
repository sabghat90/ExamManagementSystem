package MajorClasses;
import CompositionClasses.PhoneNumber;

public class Faculty extends Person {

    private Course courseWithThisInstructor;

    // constructor which initialize all the instances
    public Faculty(String name, String address, PhoneNumber phoneNumber,
                   String emailAddress, Course courseWithThisInstructor) {
        super(name, address, phoneNumber, emailAddress);
        this.courseWithThisInstructor = courseWithThisInstructor;
    }

    //get method for the course which is associated whit this instructor
    public Course getCourseWithThisInstructor() {
        return courseWithThisInstructor;
    }

    //set method for the course which is associated whit this instructor
    public void setCourseWithThisInstructor(Course courseWithThisInstructor) {
        this.courseWithThisInstructor = courseWithThisInstructor;
    }
    
    public String toString() {
        return String.format("%s%n%s%n",super.toString(),getCourseWithThisInstructor());
    }
}
