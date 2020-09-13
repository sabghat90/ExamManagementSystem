package Paper;

import java.util.regex.Pattern;

public abstract class Paper {
    private String paperTitle;
    private String paperID;
    private boolean isScheduled;
    private int numOfStudents;

    //Constructor for paper data
    public Paper(String paperTitle, String paperID, boolean isScheduled, int numOfStudents) {
        this.paperTitle = paperTitle;

        /* this will check whether the paper ID is numbers or Characters */
        if (!Pattern.matches("[0-9]+", paperID))
            throw new IllegalArgumentException("Invalid Paper ID");
        this.paperID = paperID;

        this.isScheduled = isScheduled;
         /* this will check the students number */
        if (numOfStudents < 0)
            throw new IllegalArgumentException("Number of Students should not be 0");
        this.numOfStudents = numOfStudents;
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
        /* this will check whether the paper ID is numbers or Characters */
        if (!Pattern.matches("[0-9]+", paperID))
            throw new IllegalArgumentException("Invalid Paper ID");
        this.paperID = paperID;
    }

    public boolean isScheduled() {
        return isScheduled;
    }

    public void setScheduled(boolean scheduled) {
        isScheduled = scheduled;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        /* this will check the students number */
        if (numOfStudents < 0)
            throw new IllegalArgumentException("Number of Students should not be 0");
        this.numOfStudents = numOfStudents;
    }

    public abstract String getExamType();

    public String toString() {
        return String.format("Paper Title: %s%nPaper ID: %s%nNumber of Students: %d%n",
                getPaperTitle(),getPaperID(),getNumOfStudents());
    }
}