package client;

import course.CourseOperations;
import course.CourseOperationsService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Client {
    public static void main(String[] args) {
        String clientID, deptName = "";
        Boolean advisor_id_letter = false, student_id_letter = false, loop = true;
        CourseOperations courseOperations;
        CourseOperationsService courseOperationsService = null;

        Logger logs = Logger.getLogger("Student Client");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your unique ID : ");
        clientID = sc.nextLine().toUpperCase();

        try {
            if (clientID.charAt(4) == ('A') && (clientID.substring(0, 4).equalsIgnoreCase("comp") ||
                    clientID.substring(0, 4).equalsIgnoreCase("soen") ||
                    clientID.substring(0, 4).equalsIgnoreCase("inse"))) {
                advisor_id_letter = true;
                deptName = clientID.substring(0, 4);
            } else if (clientID.charAt(4) == ('S') && (clientID.substring(0, 4).equalsIgnoreCase("comp") ||
                    clientID.substring(0, 4).equalsIgnoreCase("soen") ||
                    clientID.substring(0, 4).equalsIgnoreCase("inse"))) {
                student_id_letter = true;
                deptName = clientID.substring(0, 4);
            } else {
                System.out.println("Invalid ID.");
            }
        }
        catch (Exception e){
            System.out.println("Invalid CLient ID.");
        }

        try {
            FileHandler fileHandler = new FileHandler(clientID + ".log", true);
            logs.addHandler(fileHandler);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        AdvisorOperations advOperations = new AdvisorOperations(logs);
        StudentOperations studentOperations = new StudentOperations(logs);

        if (advisor_id_letter || student_id_letter) {
            try {
                URL url = new URL("http://localhost:7896/ws/" + deptName.toLowerCase() + "server");

                courseOperationsService = new CourseOperationsService(url);
            } catch (MalformedURLException urlException) {
                logs.severe("There has been a problem with URL.\nMessage: " + urlException.getMessage());
            }
        }

        // no remote. no work.
        if (courseOperationsService == null) {
            logs.severe("Error initializing web services object. Try again later!");
            return;
        }

        courseOperations = courseOperationsService.getCourseOperationsPort();

        if (courseOperations == null)
            return;

        if (advisor_id_letter) {
            boolean validAdvisor = false;
            try {
                validAdvisor = courseOperations.validateAdvisor(clientID);
                logs.info("Advisor has been validated at the server.");
            } catch (Exception e) {
                e.printStackTrace();
                logs.warning("Detected invalid Advisor ID.");
                System.out.println("Invalid ID.");
            }
            while (true) {
                if (validAdvisor) {
                    advOperations.chooseOperation(clientID, deptName, courseOperations);
                } else {
                    System.out.println("Invalid Client ID. Sorry!");
                    break;
                }
            }
        } else {
            boolean validStudent = false;
            try {
                validStudent = courseOperations.validateStudent(clientID);
                logs.info("Student has been validated at the server.");
            } catch (Exception e) {
                e.printStackTrace();
                logs.warning("Detected invalid Student ID.");
                System.out.println("Invalid ID.");
            }
            while (true) {
                if (validStudent) {
                    studentOperations.chooseOperation(clientID, deptName, courseOperations);
                } else {
                    System.out.println("Invalid Client ID. Sorry!");
                    break;
                }
            }

        }
    }
}
