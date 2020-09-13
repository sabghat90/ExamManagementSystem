package Paper;

public class FinalTermPaper extends Paper {
    private String paperInvigilator;
    private final String examType = "Final Term";

    public FinalTermPaper(String paperTitle, String paperID, String paperInvigilator, boolean isScheduled, int numOfStudents) {
        super(paperTitle, paperID, isScheduled, numOfStudents);
        this.paperInvigilator = paperInvigilator;
    }

    public String getPaperInvigilator() {
        return paperInvigilator;
    }

    public void setPaperInvigilator(String paperInvigilator) {
        this.paperInvigilator = paperInvigilator;
    }

    @Override
    public String getPaperTitle() {
        return super.getPaperTitle();
    }

    @Override
    public void setPaperTitle(String paperTitle) {
        super.setPaperTitle(paperTitle);
    }

    @Override
    public String getPaperID() {
        return super.getPaperID();
    }

    @Override
    public void setPaperID(String paperID) {
        super.setPaperID(paperID);
    }

    @Override
    public boolean isScheduled() {
        return super.isScheduled();
    }

    @Override
    public void setScheduled(boolean scheduled) {
        super.setScheduled(scheduled);
    }

    public String getExamType() {
        return examType;
    }

    @Override
    public String toString() {
        return String.format("%sPaper Invigilator: %s%nExam Type: " +
                "%s%n",super.toString(),getPaperInvigilator(),getExamType());
    }
}
