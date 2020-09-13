package Paper;

public class MidTermPaper extends Paper {
    private final String examType = "Mid Term";

    public MidTermPaper(String paperTitle, String paperID, boolean isScheduled, int numOfStudents) {
        super(paperTitle, paperID, isScheduled, numOfStudents);
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
        return String.format("%sExam Type: %s%n",super.toString(),getExamType());
    }
}
