package MajorClasses;
import CompositionClasses.PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person {
    private String name;
    private String address;
    private PhoneNumber phoneNumber;
    private String emailAddress;

    public Person(String name, String address, PhoneNumber phoneNumber, String emailAddress) {

        /* this validation will check whether the name of Person is valid or not
         * like the name will only contains alphabets and start from capital letter */
        if (!Pattern.matches("[a-zA-Z ]+", name))
            throw new IllegalArgumentException("Invalid Name");
        this.name = name;
        // ends name validation

        this.address = address;

        this.phoneNumber = phoneNumber;

        /* this validation will check the email address whether the email is valid or not
         * like the email will contains at least one @ and one . */
        if (isEmailIsValid(emailAddress))
            throw new IllegalArgumentException("Invalid Email Address");
        this.emailAddress = emailAddress;
        // ends email validation
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
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

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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

    public String toString() {
        return String.format("Name: %s%nAddress: %s%nPhone Number: %s%nEmail Address: %s",
                name, getAddress(), getPhoneNumber(), getEmailAddress());
    }
}