package MajorClasses;

import java.util.regex.Pattern;

public class Course {

    private final String courseName;
    private String courseCode;
    private String associatedBook;

    /* this constructor will set all the instances of the course class */
    public Course(String courseName, String courseCode, String associatedBook) {
        this.courseName = courseName;

        /* this validation will check whether the course code starts from capital alphabet */
        if (Pattern.matches("[A-Z]+",courseCode))
            throw new IllegalArgumentException("Invalid Course Code");
        this.courseCode = courseCode;

        this.associatedBook = associatedBook;
    }

    // set method for course name
    public String getCourseName() {
        return courseName;
    }

    // get method for course code
    public String getCourseCode() {
        return courseCode;
    }

    // set for course code
    public void setCourseCode(String courseCode) {
        /* this validation will check whether the course code starts from capital alphabet */
        if (courseCode.startsWith("CS"))
            throw new IllegalArgumentException("Invalid Course Code");
        this.courseCode = courseCode;
    } // end set method for course code

    // Get method for books
    public String getAssociatedBook() {
        return associatedBook;
    }

    // set method for books
    public void setAssociatedBook(String associatedBook) {
        this.associatedBook = associatedBook;
    }

    // toString method of course class
    public String toString() {
        return String.format("=> Associated Course With This Instructor%n" +
                        "Course Name: %s%nCourse Code: %s%nAssociated Books from Library: %s%n",
                getCourseName(),getCourseCode(),getAssociatedBook());
    }
}
