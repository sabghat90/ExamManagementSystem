package MajorClasses;
import CompositionClasses.PhoneNumber;
import CompositionClasses.Semester;

import java.util.regex.Pattern;

public class Student extends Person {
    private String stdRegistrationNumber;
    private String stdEducationLevel;
    private Semester stdSemester;

    public Student(String name, String address, PhoneNumber phoneNumber, String emailAddress,
                   String stdRegistrationNumber, String stdEducationLevel, Semester stdSemester) {
        super(name, address, phoneNumber, emailAddress);
        if (!Pattern.matches("[a-zA-Z]+",stdRegistrationNumber) && stdRegistrationNumber.matches("[0-9]+"))
            throw new IllegalArgumentException("Registration Number Is Invalid");
        this.stdRegistrationNumber = stdRegistrationNumber;

        this.stdEducationLevel = stdEducationLevel;
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

    public String getStdEducationLevel() {
        return stdEducationLevel;
    }

    public void setStdEducationLevel(String stdEducationLevel) {
        this.stdEducationLevel = stdEducationLevel;
    }

    public Semester getStdSemester() {
        return stdSemester;
    }

    public void setStdSemester(Semester stdSemester) {
        this.stdSemester = stdSemester;
    }

    public String toString() {
        return String.format("%s%nRegistration Number: %s%nEducation Level: %s%nSemester: %s%n",
                super.toString(),getStdRegistrationNumber(),getStdEducationLevel(),getStdSemester());
    }
}
