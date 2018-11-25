package client;

import course.CourseInterface;
import course.CourseOperationsService;

import java.net.MalformedURLException;
import java.net.URL;

public class StuOperationThread implements Runnable {
    private Thread thread;
    private String term, department, studentId, oldCourseId, newCourseId;

    StuOperationThread(String term, String department, String studentId, String oldCourseId, String newCourseId) {
        this.term = term;
        this.department = department;
        this.studentId = studentId;
        this.oldCourseId = oldCourseId;
        this.newCourseId = newCourseId;
    }

    @Override
    public void run() {
        String deptName = this.studentId.substring(0, 4);
        CourseOperationsService courseOperationsService = null;
        try {
            String address = "http://localhost:" + Client.getWsPort(deptName.toUpperCase()) + "/ws/"
                    + deptName.toLowerCase() + "server";
            URL url = new URL(address);
            System.out.println(address);

            courseOperationsService = new CourseOperationsService(url);
        } catch (MalformedURLException urlException) {
            System.out.println("There has been a problem with URL.\nMessage: " + urlException.getMessage());
        }
        if (courseOperationsService == null)
            return;
        CourseInterface courseStub = courseOperationsService.getCourseOperationsPort();
        System.out.println(studentId + " has sent request to enroll " + newCourseId + " in place of " + oldCourseId);
        String response = courseStub.swapCourse(studentId, oldCourseId, newCourseId, term, department);
        System.out.println(studentId + ": " + response);
    }

    void start() {
        System.out.println(studentId + " and " + newCourseId);
        if (thread == null) {
            thread = new Thread(this, "multi thread swap course");
            thread.start();
        }
    }
}
