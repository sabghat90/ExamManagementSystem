package MajorClasses;
import CompositionClasses.Date;
import CompositionClasses.Time;

///////////////////////////////////////////////////////////////////////////
// this is a subclass of Paper class which we used for paper collection
///////////////////////////////////////////////////////////////////////////


public class isCollected extends Paper {
    private String setIsCollected;

    /* a constructor for subclass */
    public isCollected(String paperTitle, String paperID, String courseCode, String courseInCharge, String semester,
                       String programName, Date paperDate, Time time, String examType, String invigilator, String location,
                       int numOfStudents, boolean isCollected) {

        /* this is a superclass call */
        super(paperTitle, paperID, courseCode, courseInCharge, semester, programName, paperDate, time, examType, invigilator, location, numOfStudents);
        /* this condition will check paper collection which is boolean */
        if(isCollected) {
            setIsCollected = "Paper Is Collected";
        }
        else {
            setIsCollected = "Paper isn't collected yet";
        }
    }

    public String getCollected() {
        return setIsCollected;
    }

    public String isCollectedPaper() {
        return setIsCollected;
    }
    /* a set method for paper collection checking */
    public void setCollected(boolean isCollected) {
        if(isCollected) {
            setIsCollected = "Paper Is Collected";
        }
        else {
            setIsCollected = "Paper isn't Collected Yet";
        }
    }

    public String toString() {
        return String.format("Paper ID: %s%nCourse Code: %s%nNumber of student: %d%nPaper Status: %s",
                getPaperID(),getCourseCode(),getNumOfStudents(),isCollectedPaper());
    }
}
