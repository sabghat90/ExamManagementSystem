package Paper;

import CompositionClasses.Date;
import CompositionClasses.Time;

public abstract class Paper {
    private String paperTitle;
    private String paperID;
    private boolean isScheduled;
//    private String courseCode;
//    private String courseInCharge;
//    private String semester;
//    private String programName;
//    private Date paperDate;
//    private Time time;
//    private String examType;
//    private String invigilator;
//    private String location;
//    private int numOfStudents;
//    private int totalMarks;

    //Constructor for paper data
    public Paper(String paperTitle, String paperID, boolean isScheduled) {
        this.paperTitle = paperTitle;
        this.paperID = paperID;
//        this.courseCode = courseCode;
//        this.courseInCharge = courseInCharge;
//        this.semester = semester;
//        this.programName = programName;
//        this.paperDate = paperDate;
//        this.time=time;
//        this.examType = examType;
//        this.invigilator = invigilator;
//        this.location = location;
//        this.numOfStudents = numOfStudents;
        /* this condition will check the exam marks ,
        if the exam is mid the score will assign 30 otherwise for final this will 100*/
        this.isScheduled = isScheduled;
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

    public boolean isScheduled() {
        return isScheduled;
    }

    public void setScheduled(boolean scheduled) {
        isScheduled = scheduled;
    }

    public abstract String getExamType();

    public String toString() {
        return String.format("Paper Title: %s%nPaper ID: %s%n",getPaperTitle(),getPaperID());
    }
}