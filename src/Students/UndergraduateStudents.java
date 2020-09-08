package Students;

import CompositionClasses.PhoneNumber;
import CompositionClasses.Semester;

public class UndergraduateStudents extends Student {
    private String stdEducationLevel = "Undergraduate";

    public UndergraduateStudents(String name, String address, PhoneNumber phoneNumber, String emailAddress, String stdRegistrationNumber, Semester stdSemester) {
        super(name, address, phoneNumber, emailAddress, stdRegistrationNumber, stdSemester);
    }

    @Override
    public String getStdRegistrationNumber() {
        return super.getStdRegistrationNumber();
    }

    @Override
    public void setStdRegistrationNumber(String stdRegistrationNumber) {
        super.setStdRegistrationNumber(stdRegistrationNumber);
    }

    @Override
    public String getStdEducationLevel(String stdEducationLevel) {
        return stdEducationLevel;
    }

    @Override
    public Semester getStdSemester() {
        return super.getStdSemester();
    }

    @Override
    public void setStdSemester(Semester stdSemester) {
        super.setStdSemester(stdSemester);
    }

    public String toString() {
        return String.format("%sDegree Type: %s%n", super.toString(),getStdEducationLevel(stdEducationLevel));
    }
}
