package MajorClasses;
import CompositionClasses.PhoneNumber;
import CompositionClasses.Semester;
import Paper.FinalTermPaper;
import Paper.MidTermPaper;
import Students.PostgraduateStudents;
import Students.UndergraduateStudents;

import java.util.Scanner;

////////////////////////////////////
// Sabghat Ullah Khan
// CS120192060 (A)
////////////////////////////////////

public class TestClassOfEMS {

    public static void main(String[] args) {
        /* this is the faculty staff data*/
        /* =================================================================================================== */
        Faculty[] facultyStaff = new Faculty[3];
        facultyStaff[0] = new Faculty("Ali Zeb","KUST IIT Department",new PhoneNumber("0","123","1234567"),
                "alizeb@kust.edu.pk",new Course("Object Oriented Programming","CS213","Java, How to Program"));

        facultyStaff[1] = new Faculty("Asif Khan","KUST English Department",new PhoneNumber("0","123","1234567"),
                "asifkhan@kust.edu.pk",new Course("Communication Skills","EN223","Effective Communication Skills"));

        facultyStaff[2] = new Faculty("Rida Batool","KUST IBS Department",new PhoneNumber("0","123","1234567"),
                "ridabatool@kust.edu.pk",new Course("Principle of Management","CS223","Kuntz, Management"));
        /* =================================================================================================== */

        /* mid term paper data */
        /* =================================================================================================== */
        MidTermPaper[] midTermPaper = new MidTermPaper[3];
        midTermPaper[0] = new MidTermPaper("Object Oriented Programming","45012",true, 25);
        midTermPaper[1] = new MidTermPaper("Communication Skills","78541",false, 77);
        midTermPaper[2] = new MidTermPaper("Discrete Mathematics","45012",true, 56);
        /* =================================================================================================== */

        /* final term paper data */
        /* =================================================================================================== */
        FinalTermPaper[] finalTermPapers = new FinalTermPaper[3];
        finalTermPapers[0] = new FinalTermPaper("Object Oriented Programming","45012","M. Roman", true, 25);
        finalTermPapers[1] = new FinalTermPaper("Communication Skills","78541","Sana Ullah",false, 77);
        finalTermPapers[2] = new FinalTermPaper("Discrete Mathematics","45012","Zeeshan Iqbal",true, 56);
        /* =================================================================================================== */

        /* under graduate students */
        /* =================================================================================================== */
        UndergraduateStudents[] undergoStudents = new UndergraduateStudents[4];
        undergoStudents[0] = new UndergraduateStudents("Hayat Khan","Kohat",new PhoneNumber("0","333","1234567"),
                "hayatkhan@gmail.com","CS1837383",new Semester("Spring",2020));

        undergoStudents[1] = new UndergraduateStudents("Sana Ullah","Karak",new PhoneNumber("0","333","1234567"),
                "Sanaullh@gmail.com","CS1857383",new Semester("Spring",2020));

        undergoStudents[2] = new UndergraduateStudents("Ameer Khan","Lachi",new PhoneNumber("0","333","1234567"),
                "ameerkhan@gmail.com","CS1845383",new Semester("Fall",2026));
        /* =================================================================================================== */

        /* post graduate students */
        /* =================================================================================================== */
        PostgraduateStudents[] postgraduateStudents = new PostgraduateStudents[4];
        postgraduateStudents[0] = new PostgraduateStudents("Umer","Kohat",new PhoneNumber("0","333","1234567"),
                "umer@gmail.com","CS1545383",new Semester("Fall",2020));

        postgraduateStudents[1] = new PostgraduateStudents("Sohail","Bannu",new PhoneNumber("0","333","1234567"),
                "sohail@gmail.com","CS1821383",new Semester("Fall",2028));

        postgraduateStudents[2] = new PostgraduateStudents("Sheikh","Lachi",new PhoneNumber("0","333","1234567"),
                "sheikh@gmail.com","CS1841283",new Semester("Fall",2019));
        /* ==================================================================================================== */

        /* a welcome string for just decoration */
        System.out.println("\n\t\tWELCOME TO EXAM MANAGEMENT SYSTEM\n");

        /* a simple string line to chose the option*/
        System.out.printf("Faculty => 1%nPapers%nMid Term => 2%nFinal Term => 3%nStudents%nUndergraduate => 4%n" +
                "Postgraduate => 5%n");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        switch (input) {
            case 1: {
                System.out.printf("Ali Zeb => 1%nAsif Khan => 2%nRida Batool => 3%n");
                scan = new Scanner(System.in);
                int input1 = scan.nextInt();

                for (int i = 0; i < facultyStaff.length; i++) {
                    if (facultyStaff[input1 - 1] == facultyStaff[i]) {
                        System.out.println(facultyStaff[i]);
                    }
                }
            }
            break;
            case 2: {
                System.out.printf("Object Oriented Programming => 1%nCommunication Skills => 2%nDiscrete Mathematics => 3%n");
                scan = new Scanner(System.in);
                int input2 = scan.nextInt();

                for (int i = 0; i < midTermPaper.length; i++) {
                    if (midTermPaper[input2 - 1] == midTermPaper[i]) {
                        System.out.println(midTermPaper[i]);
                    }
                }
            }
            break;
            case 3: {
                System.out.printf("Object Oriented Programming => 1%nCommunication Skills => 2%nDiscrete Mathematics => 3%n");
                scan = new Scanner(System.in);
                int input3 = scan.nextInt();

                for (int i = 0; i < facultyStaff.length; i++) {
                    if (finalTermPapers[input3 - 1] == finalTermPapers[i]) {
                        System.out.println(finalTermPapers[i]);
                    }
                }
            }
            break;
            case 4: {
                System.out.printf("Hayat Khan => 1%nSana Ullah => 2%nAmeer Khan => 3%n");
                scan = new Scanner(System.in);
                int input4 = scan.nextInt();

                for (int i = 0; i < undergoStudents.length; i++) {
                    if (undergoStudents[input4 - 1] == undergoStudents[i]) {
                        System.out.println(undergoStudents[i]);
                    }
                }
            }
            break;
            case 5: {
                System.out.printf("Umer => 1%nSohail => 2%nSheikh => 3%n");
                scan = new Scanner(System.in);
                int input5 = scan.nextInt();

                for (int i = 0; i < postgraduateStudents.length; i++) {
                    if (postgraduateStudents[input5 - 1] == postgraduateStudents[i]) {
                        System.out.println(postgraduateStudents[i]);
                    }
                }
            }
            break;
        }
    }
}
