package MajorClasses;


import CompositionClasses.Date;
import CompositionClasses.Time;


public class Paper {
    private String paperTitle;
    private String paperID;
    private String courseCode;
    private String courseInCharge;
    private String semester;
    private String programName;
    private Date paperDate;
    private Time time;
    private String examType;
    private String invigilator;
    private String location;
    private int numOfStudents;
    private int totalMarks;

    //Constructor for paper data
    public Paper(String paperTitle, String paperID, String courseCode, String courseInCharge, String semester,
                 String programName, Date paperDate, Time time, String examType, String invigilator,
                 String location, int numOfStudents) {
        this.paperTitle = paperTitle;
        this.paperID = paperID;
        this.courseCode = courseCode;
        this.courseInCharge = courseInCharge;
        this.semester = semester;
        this.programName = programName;
        this.paperDate = paperDate;
        this.time=time;
        this.examType = examType;
        this.invigilator = invigilator;
        this.location = location;
        this.numOfStudents = numOfStudents;
        /* this condition will check the exam marks ,
        if the exam is mid the score will assign 30 otherwise for final this will 100*/
        if(examType.equalsIgnoreCase("Mid Term")) {
            totalMarks = 30;
        }
        else if(examType.equalsIgnoreCase("Final Term")) {
            totalMarks = 100;
        }
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getPaperID() {
        return paperID;
    }

    public void setPaperID(String paperID) {
        this.paperID = paperID;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseInCharge() {
        return courseInCharge;
    }

    public void setCourseInCharge(String courseInCharge) {
        this.courseInCharge = courseInCharge;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Date getPaperDate() {
        return paperDate;
    }

    public void setPaperDate(Date paperDate) {
        this.paperDate = paperDate;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getInvigilator() {
        return invigilator;
    }

    public void setInvigilator(String invigilator) {
        this.invigilator = invigilator;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public String toString() {
        return String.format("Paper Title: %s%nPaper ID: %s%nCourse Code: %s%nCourse InCharge: %s%nSemester: %s%n" +
                        "Program Name: %s%nDate: %s%nPaper Time: %s%nExam Type: %s%nInvigilator: %s%nLocation: %s%n" +
                        "Number Of Students: %d%nTotal Marks: %d%n",getPaperTitle(),getPaperID(),getCourseCode(),getCourseInCharge(),
                getSemester(),getProgramName(),getPaperDate(),getTime(),getExamType(),getInvigilator(),
                getLocation(),getNumOfStudents(),getTotalMarks());
    }
}