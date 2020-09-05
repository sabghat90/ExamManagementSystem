package MajorClasses;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private final String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {

        /* this validation will check whether the name of Person is valid or not
         * like the name will only contains alphabets and start from capital letter */
        if (!Pattern.matches("[a-zA-Z ]+", name))
            throw new IllegalArgumentException("Invalid Name");
        this.name = name;
        // ends name validation

        this.address = address;

        /* this validation will check whether the phone number is valid or not
         * like the phone number will only contains the numbers from 0-9 and length will 11
         * numbers and the number will start from 0 */
        if (!(phoneNumber.matches("[0-9]+") && phoneNumber.startsWith("0") && phoneNumber.length() == 11))
            throw new IllegalArgumentException("Invalid Phone Number");
        this.phoneNumber = phoneNumber;
        // ends phone number validation

        /* this validation will check the email address whether the email is valid or not
         * like the email will contains at least one @ and one . */
        if (isEmailIsValid(emailAddress))
            throw new IllegalArgumentException("Invalid Email Address");
        this.emailAddress = emailAddress;
        // ends email validation
    }

    /* this is a special boolean method which i made for to check the email validity */
    public static boolean isEmailIsValid (String stdEmail) {
        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPattern.matcher(stdEmail);
        return !matcher.find();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) { // start setPhoneNumber method

        /* this validation will check whether the phone number is valid or not
         * like the phone number will only contains the numbers from 0-9 and length will 11
         * numbers and the number will start from 0 */
        if (!(phoneNumber.matches("[0-9]+") && phoneNumber.startsWith("0") && phoneNumber.length() == 11))
            throw new IllegalArgumentException("Invalid Phone Number");
        this.phoneNumber = phoneNumber;
    } // end setPhoneNumber method

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) { // start setEmailAddress method

        /* this validation will check the email address whether the email is valid or not
         * like the email will contains at least one @ and one . */
        if (isEmailIsValid(emailAddress))
            throw new IllegalArgumentException("Invalid Email Address");
        this.emailAddress = emailAddress;
    } // ends setEmailAddress method

    @Override
    public String toString() {
        return String.format("Name: %s%nAddress: %s%nPhone Number: %s%nEmail Address: %s%n", name, getAddress(),
                getPhoneNumber(), getEmailAddress());
    }
}