package Students;
import CompositionClasses.PhoneNumber;
import CompositionClasses.Semester;
import MajorClasses.Person;

import java.util.regex.Pattern;

public abstract class Student extends Person {
    private String stdRegistrationNumber;
    private Semester stdSemester;


    public Student(String name, String address, PhoneNumber phoneNumber, String emailAddress,
                   String stdRegistrationNumber, Semester stdSemester) {
        super(name, address, phoneNumber, emailAddress);

        /* this validation will check the registration number is valid or not */
        if (!Pattern.matches("[a-zA-Z]+",stdRegistrationNumber) && stdRegistrationNumber.matches("[0-9]+"))
            throw new IllegalArgumentException("Registration Number Is Invalid");
        this.stdRegistrationNumber = stdRegistrationNumber;
        this.stdSemester = stdSemester;
    }

    public String getStdRegistrationNumber() {
        return stdRegistrationNumber;
    }

    public void setStdRegistrationNumber(String stdRegistrationNumber) {
        /* this validation will check the registration number is valid or not */
        if (!Pattern.matches("[a-zA-Z]+",stdRegistrationNumber) && stdRegistrationNumber.matches("[0-9]+"))
            throw new IllegalArgumentException("Registration Number Is Invalid");
        this.stdRegistrationNumber = stdRegistrationNumber;
    }

    // this is an abstract method of student class
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
