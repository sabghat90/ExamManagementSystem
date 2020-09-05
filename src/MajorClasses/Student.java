package MajorClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private String stdName;
    private String stdEmail;

    public static boolean isEmailIsValid (String stdEmail) {
        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPattern.matcher(stdEmail);
        return matcher.find();
    }

    public Student(String stdName, String stdEmail) {
        this.stdName = stdName;
        if (!isEmailIsValid(stdEmail))
            throw new IllegalArgumentException("Invalid Email");
        this.stdEmail = stdEmail;

    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", stdEmail='" + stdEmail + '\'' +
                '}';
    }
}
