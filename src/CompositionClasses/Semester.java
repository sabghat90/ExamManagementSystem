package CompositionClasses;

public class Semester {
    private String semesterSession;
    private int year;

    public Semester(String semesterSession, int year) {
        this.semesterSession = semesterSession;
        this.year = year;
    }

    public String getSemesterSession() {
        return semesterSession;
    }

    public void setSemesterSession(String semesterSession) {
        this.semesterSession = semesterSession;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return String.format("%s-%d%n",getSemesterSession(),getYear());
    }
}
