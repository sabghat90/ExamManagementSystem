package Students;
import CompositionClasses.PhoneNumber;
import CompositionClasses.Semester;
import MajorClasses.Person;

import java.util.regex.Pattern;

public abstract class Student extends Person {
    private String stdRegistrationNumber;
    private String stdEducationLevel;
    private Semester stdSemester;


    public Student(String name, String address, PhoneNumber phoneNumber, String emailAddress,
                   String stdRegistrationNumber, Semester stdSemester) {
        super(name, address, phoneNumber, emailAddress);
        if (!Pattern.matches("[a-zA-Z]+",stdRegistrationNumber) && stdRegistrationNumber.matches("[0-9]+"))
            throw new IllegalArgumentException("Registration Number Is Invalid");
        this.stdRegistrationNumber = stdRegistrationNumber;
        this.stdSemester = stdSemester;
    }

    public String getStdRegistrationNumber() {
        return stdRegistrationNumber;
    }

    public void setStdRegistrationNumber(String stdRegistrationNumber) {
        if (!(Pattern.matches("[a-zA-Z1-9]+",stdRegistrationNumber) && stdRegistrationNumber.matches("[0-9]+")))
            throw new IllegalArgumentException("Registration Number Is Invalid");
        this.stdRegistrationNumber = stdRegistrationNumber;
    }

    public abstract String getStdEducationLevel(String stdEducationLevel);

    public Semester getStdSemester() {
        return stdSemester;
    }

    public void setStdSemester(Semester stdSemester) {
        this.stdSemester = stdSemester;
    }


    public String toString() {
        return String.format("%s%nRegistration Number: %s%nSemester: %s",
                super.toString(),getStdRegistrationNumber(),getStdSemester());
    }
}
