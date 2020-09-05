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

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public PhoneNumber getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getEmailAddress() {
        return super.getEmailAddress();
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        super.setEmailAddress(emailAddress);
    }


    public String toString() {
        return String.format("%s%n%s%n",super.toString(),getCourseWithThisInstructor());
    }
}
