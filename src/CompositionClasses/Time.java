package CompositionClasses;


public class Time {

    private int hrs;
    private int mints;

    public Time(int hrs, int mints) {
        //check hours range
        if(hrs< -1 || hrs>24)
            throw new IllegalArgumentException("Time must be in 0-23");
        //check mints range
        if(mints< -1 || mints>60)
            throw new IllegalArgumentException("Mints must be in 00-60");
        this.hrs = hrs;
        this.mints = mints;
    }

    public int getHrs() {
        return hrs;
    }

    /*set method for hours*/
    public void setHrs(int hrs) {
        //check hours range
        if(hrs< -1 || hrs>24)
            throw new IllegalArgumentException("Time must be in 0-23");
        this.hrs = hrs;
    }

    public int getMints() {
        return mints;
    }

    //set method for mints
    public void setMints(int mints) {
        //check mints range
        if(mints< -1 || mints>60)
            throw new IllegalArgumentException("Mints must be in 00-60");
        this.mints = mints;
    }

    public String toString() {
        return String.format("%d:%d",hrs,mints);
    }
}