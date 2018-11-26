package client;

import course.CourseInterface;
import course.CourseOperationsService;

import java.net.MalformedURLException;
import java.net.URL;
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
                    + "5. Swap Course (multiple students)\n"
                    + "6. Multiple Swap Course\n");
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
                        swapCourseMulti(term, deptName);
                    } else if (operationChoice == 6) {
                        multipleSwapCourse(term, deptName, courseStub);
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

    private void swapCourseMulti(String term, String department) {
        Scanner sc = new Scanner(System.in);
//        int noOfStudents;
        List<String> studentIds = new ArrayList<>();
        List<String> oldCourseIds = new ArrayList<>();
        List<String> newCourseIds = new ArrayList<>();

//        System.out.println("How many students to go at once?: ");
//        noOfStudents = Integer.parseInt(sc.nextLine());
        System.out.println("\nPlease enter Course ID of the course you wish to enroll for : ");
        String newcourse_id = sc.nextLine().toUpperCase();

        for (int i = 0; i < 3; i++) {
            System.out.println("Student Id: ");
            String studentId = sc.nextLine().toUpperCase();

            System.out.println("Course ID of the course you wish to drop : ");
            String oldcourse_id = sc.nextLine().toUpperCase();


            studentIds.add(studentId);
            oldCourseIds.add(oldcourse_id);
            newCourseIds.add(newcourse_id);

            System.out.println(" ");
        }

        for (int i = 0; i < 3; i++) {
            StuOperationThread stuOperationThread = new StuOperationThread(term, department, studentIds.get(i), oldCourseIds.get(i), newCourseIds.get(i));
            stuOperationThread.start();
        }
    }

    private void displayIds(List<String> ids) {
        for (String id : ids) {
            System.out.println("id: " + id);
        }
    }

    private void multipleSwapCourse(String term, String department, CourseInterface courseInterface) {
        String compStudentId = "COMPS1005";
        String soenStudentId = "SOENS1005";
        String inseStudentId = "INSES1005";

        String newCourseId = "COMP1004";

        addCourses("COMP1005", "COMP5");
        addCourses("COMP1004", "COMP4");
        addCourses("SOEN1005", "SOEN5");
        addCourses("INSE1005", "INSE5");

        enrollStudents("COMPS1005", "SOEN1005");
        enrollStudents("SOENS1005", "INSE1005");
        enrollStudents("INSES1005", "COMP1005");

//        // Get Schedule after swapping
        this.getClassSchedules("COMPS1005");
        this.getClassSchedules("SOENS1005");
        this.getClassSchedules("INSES1005");

        StuOperationThread compStudentThread = new StuOperationThread(term, department, compStudentId,
                "SOEN1005", newCourseId);
        compStudentThread.start();
        StuOperationThread soenStudentThread = new StuOperationThread(term, department, soenStudentId,
                "INSE1005", newCourseId);
        soenStudentThread.start();
        StuOperationThread inseStudentThread = new StuOperationThread(term, department, inseStudentId,
                "COMP1005", newCourseId);
        inseStudentThread.start();

        //        // Get Schedule after swapping
        this.getClassSchedules("COMPS1005");
        this.getClassSchedules("SOENS1005");
        this.getClassSchedules("INSES1005");
    }

    private void getClassSchedules(String studentId) {
        String deptName = studentId.substring(0, 4);
        CourseInterface stub = makeServer(deptName);

        if (stub == null)
            return;

        String message = stub.getClassSchedule(studentId);
        System.out.println("Student: " + studentId + " message - " + message);
    }

    private void enrollStudents(String studentId, String courseId) {
        String deptName = studentId.substring(0, 4);
        CourseInterface stub = makeServer(deptName);
        boolean udpCall = false;

        if (stub == null)
            return;

        if(!(courseId.substring(0,4).equalsIgnoreCase(studentId.substring(0, 4))))
            udpCall = true;

        String message = stub.enrollCourse(studentId, "fall", deptName, courseId, udpCall, false, true);
        System.out.println("Student: " + studentId + " Course: " + courseId + " - " + message);
    }

    private void addCourses(String courseId, String name) {
        String deptName = courseId.substring(0, 4).toUpperCase();
        String advisor = deptName + "A1001";

        CourseInterface stub = makeServer(deptName);

        if (stub == null)
            return;

        boolean success = stub.addCourse(advisor, courseId, name, "fall", 2);
        System.out.println(advisor + " courseId: " + courseId + " - " + String.valueOf(success));
    }

    @SuppressWarnings("Duplicates")
    private CourseInterface makeServer(String deptName) {
        CourseOperationsService courseOperationsService = null;
        try {
            String address = "http://localhost:" + Client.getWsPort(deptName.toUpperCase()) + "/ws/"
                    + deptName.toLowerCase() + "server";
            URL url = new URL(address);
            System.out.println(address);
            courseOperationsService = new CourseOperationsService(url);

            return courseOperationsService.getCourseOperationsPort();
        } catch (MalformedURLException urlException) {
            System.out.println("There has been a problem with URL.\nMessage: " + urlException.getMessage());
        }
        return null;
    }
}
