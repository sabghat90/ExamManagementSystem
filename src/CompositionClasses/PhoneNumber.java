package CompositionClasses;

public class PhoneNumber {
    private String prefixNumber;
    private String countryCode;
    private String postfixNumber;

    public PhoneNumber(String prefixNumber, String countryCode, String postfixNumber) {

        if (postfixNumber.equals("0"))
            throw new IllegalArgumentException("First Digit Must Be Zero");
        this.prefixNumber = prefixNumber;

        if (!(countryCode.matches("[0-9]+") && countryCode.length() == 3 ))
            throw new IllegalArgumentException("Country Code Invalid");
        this.countryCode = countryCode;

        if (!(postfixNumber.matches("[0-9]+") && postfixNumber.length() == 7))
            throw new IllegalArgumentException("postfix number is invalid");
        this.postfixNumber = postfixNumber;
    }

    public String getPrefixNumber() {
        return prefixNumber;
    }

    public void setPrefixNumber(String prefixNumber) {
        if (postfixNumber.equals("0"))
            throw new IllegalArgumentException("First Digit Must Be Zero");
        this.prefixNumber = prefixNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        if (!(countryCode.matches("[0-9]+") && countryCode.length() == 3 ))
            throw new IllegalArgumentException("Country Code Invalid");
        this.countryCode = countryCode;
    }

    public String getPostfixNumber() {
        return postfixNumber;
    }

    public void setPostfixNumber(String postfixNumber) {
        if (!(postfixNumber.matches("[0-9]+") && postfixNumber.length() == 7))
            throw new IllegalArgumentException("postfix number is invalid");
        this.postfixNumber = postfixNumber;
    }

    public String toString() {
        return String.format("%s-%s-%s",
                getPrefixNumber(),getCountryCode(),getPostfixNumber());
    }
}
