
package course;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CourseOperations", targetNamespace = "http://course/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CourseOperations {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "initializeValues", targetNamespace = "http://course/", className = "course.InitializeValues")
    @ResponseWrapper(localName = "initializeValuesResponse", targetNamespace = "http://course/", className = "course.InitializeValuesResponse")
    @Action(input = "http://course/CourseOperations/initializeValuesRequest", output = "http://course/CourseOperations/initializeValuesResponse")
    public void initializeValues(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateStudent", targetNamespace = "http://course/", className = "course.ValidateStudent")
    @ResponseWrapper(localName = "validateStudentResponse", targetNamespace = "http://course/", className = "course.ValidateStudentResponse")
    @Action(input = "http://course/CourseOperations/validateStudentRequest", output = "http://course/CourseOperations/validateStudentResponse")
    public boolean validateStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateAdvisor", targetNamespace = "http://course/", className = "course.ValidateAdvisor")
    @ResponseWrapper(localName = "validateAdvisorResponse", targetNamespace = "http://course/", className = "course.ValidateAdvisorResponse")
    @Action(input = "http://course/CourseOperations/validateAdvisorRequest", output = "http://course/CourseOperations/validateAdvisorResponse")
    public boolean validateAdvisor(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCourse", targetNamespace = "http://course/", className = "course.AddCourse")
    @ResponseWrapper(localName = "addCourseResponse", targetNamespace = "http://course/", className = "course.AddCourseResponse")
    @Action(input = "http://course/CourseOperations/addCourseRequest", output = "http://course/CourseOperations/addCourseResponse")
    public boolean addCourse(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4);

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "showCourses", targetNamespace = "http://course/", className = "course.ShowCourses")
    @ResponseWrapper(localName = "showCoursesResponse", targetNamespace = "http://course/", className = "course.ShowCoursesResponse")
    @Action(input = "http://course/CourseOperations/showCoursesRequest", output = "http://course/CourseOperations/showCoursesResponse")
    public void showCourses();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCourse", targetNamespace = "http://course/", className = "course.DeleteCourse")
    @ResponseWrapper(localName = "deleteCourseResponse", targetNamespace = "http://course/", className = "course.DeleteCourseResponse")
    @Action(input = "http://course/CourseOperations/deleteCourseRequest", output = "http://course/CourseOperations/deleteCourseResponse")
    public boolean deleteCourse(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg6
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "enrollCourse", targetNamespace = "http://course/", className = "course.EnrollCourse")
    @ResponseWrapper(localName = "enrollCourseResponse", targetNamespace = "http://course/", className = "course.EnrollCourseResponse")
    @Action(input = "http://course/CourseOperations/enrollCourseRequest", output = "http://course/CourseOperations/enrollCourseResponse")
    public String enrollCourse(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        boolean arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        boolean arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        boolean arg6);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "displayCourses", targetNamespace = "http://course/", className = "course.DisplayCourses")
    @ResponseWrapper(localName = "displayCoursesResponse", targetNamespace = "http://course/", className = "course.DisplayCoursesResponse")
    @Action(input = "http://course/CourseOperations/displayCoursesRequest", output = "http://course/CourseOperations/displayCoursesResponse")
    public String displayCourses(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dropCourse", targetNamespace = "http://course/", className = "course.DropCourse")
    @ResponseWrapper(localName = "dropCourseResponse", targetNamespace = "http://course/", className = "course.DropCourseResponse")
    @Action(input = "http://course/CourseOperations/dropCourseRequest", output = "http://course/CourseOperations/dropCourseResponse")
    public boolean dropCourse(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        boolean arg4);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClassSchedule", targetNamespace = "http://course/", className = "course.GetClassSchedule")
    @ResponseWrapper(localName = "getClassScheduleResponse", targetNamespace = "http://course/", className = "course.GetClassScheduleResponse")
    @Action(input = "http://course/CourseOperations/getClassScheduleRequest", output = "http://course/CourseOperations/getClassScheduleResponse")
    public String getClassSchedule(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listCourseAvailability", targetNamespace = "http://course/", className = "course.ListCourseAvailability")
    @ResponseWrapper(localName = "listCourseAvailabilityResponse", targetNamespace = "http://course/", className = "course.ListCourseAvailabilityResponse")
    @Action(input = "http://course/CourseOperations/listCourseAvailabilityRequest", output = "http://course/CourseOperations/listCourseAvailabilityResponse")
    public String listCourseAvailability(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        boolean arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "swapCourse", targetNamespace = "http://course/", className = "course.SwapCourse")
    @ResponseWrapper(localName = "swapCourseResponse", targetNamespace = "http://course/", className = "course.SwapCourseResponse")
    @Action(input = "http://course/CourseOperations/swapCourseRequest", output = "http://course/CourseOperations/swapCourseResponse")
    public String swapCourse(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

}
