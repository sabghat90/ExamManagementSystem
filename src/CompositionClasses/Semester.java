package CompositionClasses;

public class Semester {
    private int stdClass;
    private String semesterSession;
    private int year;

    public Semester(int stdClass, String semesterSession, int year) {
        this.stdClass = stdClass;
        this.semesterSession = semesterSession;
        this.year = year;
    }

    public int getStdClass() {
        return stdClass;
    }

    public void setStdClass(int stdClass) {
        this.stdClass = stdClass;
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
        return String.format("%dth %s-%d%n",getStdClass(),getSemesterSession(),getYear());
    }
}
