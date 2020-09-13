package MajorClasses;
import CompositionClasses.PhoneNumber;
import CompositionClasses.Semester;
import Paper.MidTermPaper;
import Students.UndergraduateStudents;

import java.util.Scanner;

////////////////////////////////////
// Sabghat Ullah Khan
// CS120192060 (A)
////////////////////////////////////

public class TestClassOfEMS {

    public static void main(String[] args) {
        /* =================================================================================================== */

        /* =================================================================================================== */

        /* =================================================================================================== */
        Faculty[] facultyStaff = new Faculty[3];
        facultyStaff[0] = new Faculty("Ali Zeb","KUST IIT Department",new PhoneNumber("0","123","1234567"),
                "alizeb@kust.edu.pk",new Course("Object Oriented Programming","CS213","Java, How to Program"));

        facultyStaff[1] = new Faculty("Asif Khan","KUST English Department",new PhoneNumber("0","123","1234567"),
                "asifkhan@kust.edu.pk",new Course("Communication Skills","EN223","Effective Communication Skills"));

        facultyStaff[2] = new Faculty("Rida Batool","KUST IBS Department",new PhoneNumber("0","123","1234567"),
                "ridabatool@kust.edu.pk",new Course("Principle of Management","CS223","Kuntz, Management"));
        /* =================================================================================================== */

        /* =================================================================================================== */
        MidTermPaper[] midTermPaper = new MidTermPaper[3];
        midTermPaper[0] = new MidTermPaper("Object Oriented Programming","45012",true, 25);
        midTermPaper[1] = new MidTermPaper("Communication Skills","78541",false, 77);
        midTermPaper[2] = new MidTermPaper("Discrete Mathematics","45012",true, 56);
        /* =================================================================================================== */

        /* =================================================================================================== */
        UndergraduateStudents[] undergoStudents = new UndergraduateStudents[4];
        undergoStudents[0] = new UndergraduateStudents("Hayat Khan","Kohat",new PhoneNumber("0","333","1234567"),
                "hayatkhan@gmail.com","CS1837383",new Semester("Spring",2020));

        undergoStudents[1] = new UndergraduateStudents("Sana Ullah","Karak",new PhoneNumber("0","333","1234567"),
                "Sanaullh@gmail.com","CS1857383",new Semester("Spring",2020));

        undergoStudents[2] = new UndergraduateStudents("Ameer Khan","Lachi",new PhoneNumber("0","333","1234567"),
                "ameerkhan@gmail.com","CS1845383",new Semester("Fall",2020));
        /* ==================================================================================================== */


        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        for (int i = 0; i < facultyStaff.length; i++) {
            if (i == input) {
                System.out.println(facultyStaff[i - 1]);
            }
        }
    }
}
