package MajorClasses;

import CompositionClasses.Semester;

import java.util.regex.Pattern;

public class Course {

    private final String courseName;
    private String courseCode;
    private String associatedBook;

    public Course(String courseName, String courseCode, String associatedBook) {
        this.courseName = courseName;

        /* this validation will check whether the course code starts from capital alphabet */
        if (Pattern.matches("[A-Z]+",courseCode))
            throw new IllegalArgumentException("Invalid Course Code");
        this.courseCode = courseCode;

        this.associatedBook = associatedBook;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        /* this validation will check whether the course code starts from capital alphabet */
        if (courseCode.startsWith("CS"))
            throw new IllegalArgumentException("Invalid Course Code");
        this.courseCode = courseCode;
    }

    public String getAssociatedBook() {
        return associatedBook;
    }

    public void setAssociatedBook(String associatedBook) {
        this.associatedBook = associatedBook;
    }

    public String toString() {
        return String.format("=> Associated Course With This Instructor%n" +
                        "Course Name: %s%nCourse Code: %s%nAssociated Books from Library: %s%n",
                getCourseName(),getCourseCode(),getAssociatedBook());
    }
}
