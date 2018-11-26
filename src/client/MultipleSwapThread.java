package client;

import course.CourseInterface;
import course.CourseOperationsService;

import java.net.MalformedURLException;
import java.net.URL;

public class MultipleSwapThread implements Runnable{
private Thread thread;
    private String term, department, studentId, oldCourseId, newCourseId;

    MultipleSwapThread(String term, String department, String studentId, String oldCourseId, String newCourseId) {
        this.term = term;
        this.department = department;
        this.studentId = studentId;
        this.oldCourseId = oldCourseId;
        this.newCourseId = newCourseId;
    }

    @SuppressWarnings("Duplicates")
    public CourseInterface makeServer(String deptName) {
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

    @SuppressWarnings("Duplicates")
    @Override
    public void run() {
        String deptName = this.studentId.substring(0, 4);

        CourseInterface courseStub = makeServer(deptName);

        if (courseStub == null)
            return;



        boolean addCompCourseResponse = courseStub.addCourse("COMPA1001", "COMP1005", "COMP5", "fall", 2);
        System.out.println("Advisor COMPA1001 has successfully added course COMP1005 : " + addCompCourseResponse);
        boolean addCompCourse2Response = courseStub.addCourse("COMPA1001", "COMP1004", "COMP5", "fall", 2);
        System.out.println("Advisor COMPA1001 has successfully added course COMP1004 : " + addCompCourse2Response);
        boolean addSoenCourseResponse = courseStub.addCourse("SOENA1001", "SOEN1005", "SOEN5", "fall", 2);
        System.out.println("Advisor SOENA1001 has successfully added course SOEN1005 : " + addSoenCourseResponse);
        boolean addInseCourseResponse = courseStub.addCourse("INSEA1001", "INSE1005", "INSE5", "fall", 2);
        System.out.println("Advisor INSEA1001 has successfully added course INSE1005 : " + addInseCourseResponse);

        String enrollCompStudent = courseStub.enrollCourse("COMPS1005", "fall", "COMP", "COMP1005", false, false, false);
        System.out.println("COMP Student Enroll Status : " + enrollCompStudent);
        String enrollSoenStudent = courseStub.enrollCourse("SOENS1005", "fall", "SOEN", "SOEN1005", false, false, false);
        System.out.println("SOEN Student Enroll Status : " + enrollSoenStudent);
        String enrollInseStudent = courseStub.enrollCourse("INSES1005", "fall", "INSE", "INSE1005", false, false, false);
        System.out.println("INSE Student Enroll Status : " + enrollInseStudent);

//        System.out.println(studentId + " has sent request to enroll " + newCourseId + " in place of " + oldCourseId);
        String compStudentSwapResponse = courseStub.swapCourse("COMPS1005", "COMP1005", "COMP1004", term, department);
        System.out.println(studentId + ": " + compStudentSwapResponse);
        String soenStudentSwapResponse = courseStub.swapCourse("SOENS1005", "SOEN1005", "COMP1004", term, department);
        System.out.println(studentId + ": " + soenStudentSwapResponse);
        String inseStudentSwapResponse = courseStub.swapCourse("INSES1005", "INSE1005", "COMP1004", term, department);
        System.out.println(studentId + ": " + inseStudentSwapResponse);
    }

    void start() {
        System.out.println("Student ID : " + studentId + "\nOld Course ID : " + oldCourseId + "\nNew Course ID : " + newCourseId);
        if (thread == null) {
            thread = new Thread(this, "multi thread swap course");
            thread.start();
        }
    }
}