package client;

import course.CourseInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

class StudentOperations {
    private Logger logs;

    StudentOperations(Logger logs) {
        this.logs = logs;
    }

    void chooseOperation(String id, String deptName, CourseInterface courseStub) {
        try {
            Scanner sc = new Scanner(System.in);
            String term;
            System.out.println("\n Choose the operation you wish to perform :- \n "
                    + "1. Enroll Course \n"
                    + "2. Drop Course \n "
                    + "3. View Class Schedule \n"
                    + "4. Swap Course \n"
                    + "5. Swap Course (multiple students)\n");
            int operationChoice = Integer.parseInt(sc.nextLine());
            if (operationChoice == 3) {
                getClassSchedule(id, courseStub);
            } else {
                System.out.println("Choose the term :- \n" +
                        "-> Fall\n" +
                        "-> Winter\n" +
                        "-> Summer\n");
                term = sc.nextLine().toLowerCase();
                if (term.equalsIgnoreCase("Fall") ||
                        term.equalsIgnoreCase("Winter") ||
                        term.equalsIgnoreCase("Summer")) {
                    if (operationChoice == 1) {
                        enrollCourse(id, term, deptName, courseStub);
                    } else if (operationChoice == 2) {
                        dropCourse(id, term, deptName, courseStub);
                    } else if (operationChoice == 4){
                        swapCourse(id, term, deptName, courseStub);
                    } else if (operationChoice == 5) {
                        swapCourseMulti(term, deptName, courseStub);
                    }
                } else {
                    System.out.println("Please enter valid term name. Try Again!");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter number choices only.");
        }
    }

    private void enrollCourse(String studentID, String term, String department, CourseInterface courseStub) {
        Scanner sc = new Scanner(System.in);
        String course_id;
        boolean udpCall = false;
        /* HashMap<String, CourseData> courses = serverInterface.displayCourses(term);
        System.out.println("\n Following courses are available for " + term + " term:- \n");
        for (Map.Entry<String, CourseData> theTerm : courses.entrySet()) {
            String courseID = theTerm.getKey();
            CourseData courseDetails = theTerm.getValue();
            int seatsAvailable = courseDetails.getSeats_available();
            System.out.println("\n -> CourseData ID : " + courseID +
                    "\n CourseData Name : " + courseDetails.getCourse_name() +
                    "\n Total Capacity : " + courseDetails.getCourse_capacity() +
                    "\n Seats Available : " + courseDetails.getSeats_available());
        } */
        System.out.println("\nPlease enter Course ID of the course you wish to enroll for : ");
        course_id = sc.nextLine().toUpperCase();

        if(!(course_id.substring(0,4).equalsIgnoreCase(studentID.substring(0, 4)))){
            udpCall = true;
        }


        String enrollResult = courseStub.enrollCourse(studentID, term, department, course_id, udpCall,false, true);
        if (enrollResult.equalsIgnoreCase("limit")) {
            System.out.println("You cannot enroll more than 3 courses per term.");
        } else if (enrollResult.equalsIgnoreCase("enrolledAlready")) {
            System.out.println("You have already enrolled for " + course_id + " course for " + term + " term.");
        } else if (enrollResult.equalsIgnoreCase("enrolledSuccessfully")) {
            System.out.println("\n" + studentID + " has successfully enrolled for " + course_id + " course for " + term + " term.");
        } else if (enrollResult.equalsIgnoreCase("courseNotFound")) {
            System.out.println("There is no such course for " + term + " term.");
        } else if(enrollResult.equalsIgnoreCase("courseFull")){
            System.out.println("Sorry, there are no seats available in this course!");
        } else if(enrollResult.equalsIgnoreCase("deptLimit")){
            System.out.println("Sorry, you can enroll in maximum two out of department courses only.");
        }
        else {
            System.out.println("\nEnroll unsuccessful. Please try again!");
        }
    }

    private void dropCourse(String studentID, String term, String department, CourseInterface courseStub) {
        Scanner sc = new Scanner(System.in);
        String course_id;
        boolean udpCall = false;

        String classScheduleMap = courseStub.getClassSchedule(studentID);
        if (!classScheduleMap.isEmpty()){
            System.out.println(classScheduleMap);

            System.out.println("Course ID of the course you wish to drop : ");
            course_id = sc.nextLine().toUpperCase();

            if(!(course_id.substring(0,4).equalsIgnoreCase(studentID.substring(0, 4))))
                udpCall = true;

            boolean dropCourseResponse = courseStub.dropCourse(studentID, course_id, term, department, udpCall);
            if (dropCourseResponse) {
                System.out.println(studentID + " student has successfully dropped " + course_id + " course for " + term + " term.");
            } else {
                System.out.println(studentID + " student has no course registered with course ID " + course_id + " for " + term + " term.");
            }
        } else {
            System.out.println("No courses enrolled.");
        }
    }

    private void getClassSchedule(String studentID, CourseInterface courseStub) {
        String classScheduleMap = courseStub.getClassSchedule(studentID);
        if (!classScheduleMap.isEmpty()){
            System.out.println("Courses enrolled by " + studentID + " are as follows :-");
            System.out.println(classScheduleMap);
        } else{
            System.out.println("No courses enrolled.");
        }
    }

    private void swapCourse(String studentID, String term, String department, CourseInterface courseStub){
        Scanner sc = new Scanner(System.in);
        String oldcourse_id, newcourse_id;
        boolean udpCall = false;

        System.out.println("Course ID of the course you wish to drop : ");
        oldcourse_id = sc.nextLine().toUpperCase();

        System.out.println("\nPlease enter Course ID of the course you wish to enroll for : ");
        newcourse_id = sc.nextLine().toUpperCase();

        String response = courseStub.swapCourse(studentID, oldcourse_id, newcourse_id, term, department);
        System.out.println(response);

    }

    private void swapCourseMulti(String term, String department, CourseInterface courseStub) {
        Scanner sc = new Scanner(System.in);
        int noOfStudents;
        List<String> studentIds = new ArrayList<>();
        List<String> oldCourseIds = new ArrayList<>();
        List<String> newCourseIds = new ArrayList<>();

        System.out.println("How many students to go at once?: ");
        noOfStudents = Integer.parseInt(sc.nextLine());
        System.out.println("\nPlease enter Course ID of the course you wish to enroll for : ");
        String newcourse_id = sc.nextLine().toUpperCase();

        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("Student Id: ");
            String studentId = sc.nextLine().toUpperCase();

            System.out.println("Course ID of the course you wish to drop : ");
            String oldcourse_id = sc.nextLine().toUpperCase();


            studentIds.add(studentId);
            oldCourseIds.add(oldcourse_id);
            newCourseIds.add(newcourse_id);

            System.out.println(" ");
        }

        for (int i = 0; i < noOfStudents; i++) {
            StuOperationThread stuOperationThread = new StuOperationThread(courseStub, term, department, studentIds.get(i), oldCourseIds.get(i), newCourseIds.get(i));
            stuOperationThread.start();
        }
    }
}
