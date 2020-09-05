package MajorClasses;

public class Course {

    private final String courseName;
    private String courseCode;
    private String associatedBook;

    public Course(String courseName, String courseCode, String associatedBook) {
        this.courseName = courseName;

        if (!courseCode.startsWith("CS"))
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
        return String.format("Course Name: %s%nCourse Code: %s%nAssociated Books from Library: %s%n",getCourseName(),getCourseCode(),getAssociatedBook());
    }
}
