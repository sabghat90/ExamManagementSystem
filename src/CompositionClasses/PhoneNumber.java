package CompositionClasses;

public class PhoneNumber {
    private String prefixNumber;
    private String countryCode;
    private String postfixNumber;

    public PhoneNumber(String prefixNumber, String countryCode, String postfixNumber) {

        /* this validation will check whether the first digit is 0 or not */
        if (postfixNumber.equals("0"))
            throw new IllegalArgumentException("First Digit Must Be Zero");
        this.prefixNumber = prefixNumber;

        /* this validation will check whether the country is under 0-9 and 3 digits */
        if (!(countryCode.matches("[0-9]+") && countryCode.length() == 3 ))
            throw new IllegalArgumentException("Country Code Invalid");
        this.countryCode = countryCode;

        /* this validation will check whether the post fix number is under 0-9 and 7 digits */
        if (!(postfixNumber.matches("[0-9]+") && postfixNumber.length() == 7))
            throw new IllegalArgumentException("postfix number is invalid");
        this.postfixNumber = postfixNumber;
    }

    public String getPrefixNumber() {
        return prefixNumber;
    }

    public void setPrefixNumber(String prefixNumber) {
        /* this validation will check whether the first digit is 0 or not */
        if (postfixNumber.equals("0"))
            throw new IllegalArgumentException("First Digit Must Be Zero");
        this.prefixNumber = prefixNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        /* this validation will check whether the country is under 0-9 and 3 digits */
        if (!(countryCode.matches("[0-9]+") && countryCode.length() == 3 ))
            throw new IllegalArgumentException("Country Code Invalid");
        this.countryCode = countryCode;
    }

    public String getPostfixNumber() {
        return postfixNumber;
    }

    public void setPostfixNumber(String postfixNumber) {
        /* this validation will check whether the post fix number is under 0-9 and 7 digits */
        if (!(postfixNumber.matches("[0-9]+") && postfixNumber.length() == 7))
            throw new IllegalArgumentException("postfix number is invalid");
        this.postfixNumber = postfixNumber;
    }

    public String toString() {
        return String.format("%s-%s-%s",
                getPrefixNumber(),getCountryCode(),getPostfixNumber());
    }
}
