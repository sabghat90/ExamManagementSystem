package MajorClasses;
import java.util.Scanner;

////////////////////////////////////
// Sabghat Ullah Khan
// CS120192060 (A)
////////////////////////////////////

public class TestClassOfEMS {

    public static void main(String[] args) {

        Faculty faculty = new Faculty("Ali Zeb","Kohat","03324534566","alizeb@gmail.com",new Course("Java","CS213","Java9"));
        System.out.println(faculty);

//        Paper[] Paper = new Paper[3];
//        /*Paper Data which are transfer to Paper Class Constructor, from line no 8-22*/
//        /*Paper 1*/
//        Paper[0] = new Paper("Object Oriented Programming and Design", "96452", "CS-213",
//                "Ali Zeb", "2nd", "BS-CS", new Date(4, 21, 2020),
//                new Time(9, 0), "Mid Term", "Sana Ullah Khan", "Room# 12", 76);
//        /*Paper 2*/
//        Paper[1] = new Paper("Programming Fundamentals", "15468", "CS-102",
//                "Muhammad Roman", "1st", "BS-CS", new Date(3, 22, 2020),
//                new Time(11, 30), "Mid Term", "Zeeshan Iqbal", "Room# 15", 80);
//        /*Paper 3*/
//        Paper[2] = new Paper("Principles of Management", "10068", "BS-121", "Mrs. Rida Batool",
//                "2nd", "BS-CS", new Date(3, 22, 2020), new Time(9, 0),
//                "Mid Term", "Ali Zeb", "Room# 4", 69);
//        /*Paper data Limit*/
//
//        /* send data to a isCollected subclass constructor, from line no 25-36 */
//        Paper[] isCollected = new Paper[3];
//        isCollected[0] = new isCollected("Object Oriented Programming and Design", "96452", "CS-213",
//                "Ali Zeb", "2nd", "BS-CS", new Date(4, 21, 2020), new Time(9, 0), "Mid Term",
//                "Sana Ullah Khan", "Room# 12", 76, true);
//
//        isCollected[1] = new isCollected("Programming Fundamentals", "15468", "CS-102", "Muhammad Roman",
//                "1st", "BS-CS", new Date(3, 22, 2020), new Time(11, 30), "Mid Term",
//                "Zeeshan Iqbal", "Room# 15", 88, false);
//
//        isCollected[2] = new isCollected("Principles of Management", "10068", "BS-121", "Mrs. Rida Batool",
//                "2nd", "BS-CS", new Date(3, 22, 2020), new Time(1, 30), "Final Term",
//                "Ali Zeb", "Room# 4", 69, true);
//
//        /* faculty members data which i send to faculty class constructor */
//        Faculty[] faculty = new Faculty[3];
//        faculty[0] = new Faculty("Ali Zeb","FACULTY1021");
//        faculty[1] = new Faculty("Muhammad Roman","FACULTY1421");
//        faculty[2] = new Faculty("Mrs. Rida Batool","FACULTY1551");
//
//        /* course class data which i send to course class */
//        Course[] course = new Course[3];
//        course[0] = new Course("Introduction to Computing","CS101");
//        course[1] = new Course("Discrete Mathematics","MATH-216");
//        course[2] = new Course("Principles Of Management","BS-121");
//
//        ListOfPaper list = new ListOfPaper();
//
//        /* a welcome string for just decoration */
//        System.out.println("\n\t\tWELCOME TO EXAM MANAGEMENT SYSTEM\n");
//
//        /* a scanner object for method selection */
//        Scanner index = new Scanner(System.in);
//        int input;
//        System.out.printf("For Paper Details: 1%nFor Paper Status: 2%nFor Faculty Members: 3%nFor Course Information: 4%n");
//        input = index.nextInt();
//        switch (input) {
//            case 1: {
//                Scanner inputForPaper = new Scanner(System.in);
//                int inputNum;
//                System.out.println(list.listOfPaper());
//                inputNum = inputForPaper.nextInt();
//                /*this loop will check Paper*/
//                for (int i = 0; i < 3; i++) {
//                    if (Paper[i] == Paper[inputNum]) {
//                        System.out.println(Paper[i - 1]);
//                    }
//                }
//            }
//            break;
//            case 2: {
//                System.out.println(list.listOfPaper());
//                Scanner inputForColl = new Scanner(System.in);
//                int inputNum;
//                inputNum = inputForColl.nextInt();
//                for (int i = 0; i < 3; i++) {
//                    if (isCollected[i] == isCollected[inputNum-1]) {
//                        System.out.println(isCollected[i]);
//                    }
//                }
//            }
//            break;
//            case 3: {
//                System.out.println(list.listOfPaper());
//                Scanner inputForFaculty = new Scanner(System.in);
//                int inputNum1;
//                inputNum1 = inputForFaculty.nextInt();
//                for(int i=0; i<3; i++) {
//                    if(faculty[i] == faculty[inputNum1-1]) {
//                        System.out.println(faculty[i]);
//                    }
//                }
//            }
//            break;
//            case 4: {
//                System.out.println(list.listOfPaper());
//                Scanner inputForCourse = new Scanner(System.in);
//                int input3;
//                input3 = inputForCourse.nextInt();
//                /*this loop will check course*/
//                for (int i = 0; i < 3; i++) {
//                    if (course[i] == course[input3 - 1]) {
//                        System.out.println(course[i]);
//                        System.out.println("Paper Related To This Course is :\n");
//                        System.out.println(Paper[i]);
//                    }
//                }
//            }
//            break;
//            default: {
//                System.out.println("Invalid Entry");
//            }
//        }
    }
}


class ListOfPaper {
    public String listOfPaper() {
        return String.format("For Object Oriented Programming and Design: 1%nProgramming Fundamentals: 2%nPrinciples of Management: 3%n");
    }
}
