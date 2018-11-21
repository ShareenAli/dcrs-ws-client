
package course;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the course package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCourse_QNAME = new QName("http://course/", "addCourse");
    private final static QName _AddCourseResponse_QNAME = new QName("http://course/", "addCourseResponse");
    private final static QName _DeleteCourse_QNAME = new QName("http://course/", "deleteCourse");
    private final static QName _DeleteCourseResponse_QNAME = new QName("http://course/", "deleteCourseResponse");
    private final static QName _DisplayCourses_QNAME = new QName("http://course/", "displayCourses");
    private final static QName _DisplayCoursesResponse_QNAME = new QName("http://course/", "displayCoursesResponse");
    private final static QName _DropCourse_QNAME = new QName("http://course/", "dropCourse");
    private final static QName _DropCourseResponse_QNAME = new QName("http://course/", "dropCourseResponse");
    private final static QName _EnrollCourse_QNAME = new QName("http://course/", "enrollCourse");
    private final static QName _EnrollCourseResponse_QNAME = new QName("http://course/", "enrollCourseResponse");
    private final static QName _GetClassSchedule_QNAME = new QName("http://course/", "getClassSchedule");
    private final static QName _GetClassScheduleResponse_QNAME = new QName("http://course/", "getClassScheduleResponse");
    private final static QName _InitializeValues_QNAME = new QName("http://course/", "initializeValues");
    private final static QName _InitializeValuesResponse_QNAME = new QName("http://course/", "initializeValuesResponse");
    private final static QName _ListCourseAvailability_QNAME = new QName("http://course/", "listCourseAvailability");
    private final static QName _ListCourseAvailabilityResponse_QNAME = new QName("http://course/", "listCourseAvailabilityResponse");
    private final static QName _ShowCourses_QNAME = new QName("http://course/", "showCourses");
    private final static QName _ShowCoursesResponse_QNAME = new QName("http://course/", "showCoursesResponse");
    private final static QName _SwapCourse_QNAME = new QName("http://course/", "swapCourse");
    private final static QName _SwapCourseResponse_QNAME = new QName("http://course/", "swapCourseResponse");
    private final static QName _ValidateAdvisor_QNAME = new QName("http://course/", "validateAdvisor");
    private final static QName _ValidateAdvisorResponse_QNAME = new QName("http://course/", "validateAdvisorResponse");
    private final static QName _ValidateStudent_QNAME = new QName("http://course/", "validateStudent");
    private final static QName _ValidateStudentResponse_QNAME = new QName("http://course/", "validateStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: course
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCourse }
     * 
     */
    public AddCourse createAddCourse() {
        return new AddCourse();
    }

    /**
     * Create an instance of {@link AddCourseResponse }
     * 
     */
    public AddCourseResponse createAddCourseResponse() {
        return new AddCourseResponse();
    }

    /**
     * Create an instance of {@link DeleteCourse }
     * 
     */
    public DeleteCourse createDeleteCourse() {
        return new DeleteCourse();
    }

    /**
     * Create an instance of {@link DeleteCourseResponse }
     * 
     */
    public DeleteCourseResponse createDeleteCourseResponse() {
        return new DeleteCourseResponse();
    }

    /**
     * Create an instance of {@link DisplayCourses }
     * 
     */
    public DisplayCourses createDisplayCourses() {
        return new DisplayCourses();
    }

    /**
     * Create an instance of {@link DisplayCoursesResponse }
     * 
     */
    public DisplayCoursesResponse createDisplayCoursesResponse() {
        return new DisplayCoursesResponse();
    }

    /**
     * Create an instance of {@link DropCourse }
     * 
     */
    public DropCourse createDropCourse() {
        return new DropCourse();
    }

    /**
     * Create an instance of {@link DropCourseResponse }
     * 
     */
    public DropCourseResponse createDropCourseResponse() {
        return new DropCourseResponse();
    }

    /**
     * Create an instance of {@link EnrollCourse }
     * 
     */
    public EnrollCourse createEnrollCourse() {
        return new EnrollCourse();
    }

    /**
     * Create an instance of {@link EnrollCourseResponse }
     * 
     */
    public EnrollCourseResponse createEnrollCourseResponse() {
        return new EnrollCourseResponse();
    }

    /**
     * Create an instance of {@link GetClassSchedule }
     * 
     */
    public GetClassSchedule createGetClassSchedule() {
        return new GetClassSchedule();
    }

    /**
     * Create an instance of {@link GetClassScheduleResponse }
     * 
     */
    public GetClassScheduleResponse createGetClassScheduleResponse() {
        return new GetClassScheduleResponse();
    }

    /**
     * Create an instance of {@link InitializeValues }
     * 
     */
    public InitializeValues createInitializeValues() {
        return new InitializeValues();
    }

    /**
     * Create an instance of {@link InitializeValuesResponse }
     * 
     */
    public InitializeValuesResponse createInitializeValuesResponse() {
        return new InitializeValuesResponse();
    }

    /**
     * Create an instance of {@link ListCourseAvailability }
     * 
     */
    public ListCourseAvailability createListCourseAvailability() {
        return new ListCourseAvailability();
    }

    /**
     * Create an instance of {@link ListCourseAvailabilityResponse }
     * 
     */
    public ListCourseAvailabilityResponse createListCourseAvailabilityResponse() {
        return new ListCourseAvailabilityResponse();
    }

    /**
     * Create an instance of {@link ShowCourses }
     * 
     */
    public ShowCourses createShowCourses() {
        return new ShowCourses();
    }

    /**
     * Create an instance of {@link ShowCoursesResponse }
     * 
     */
    public ShowCoursesResponse createShowCoursesResponse() {
        return new ShowCoursesResponse();
    }

    /**
     * Create an instance of {@link SwapCourse }
     * 
     */
    public SwapCourse createSwapCourse() {
        return new SwapCourse();
    }

    /**
     * Create an instance of {@link SwapCourseResponse }
     * 
     */
    public SwapCourseResponse createSwapCourseResponse() {
        return new SwapCourseResponse();
    }

    /**
     * Create an instance of {@link ValidateAdvisor }
     * 
     */
    public ValidateAdvisor createValidateAdvisor() {
        return new ValidateAdvisor();
    }

    /**
     * Create an instance of {@link ValidateAdvisorResponse }
     * 
     */
    public ValidateAdvisorResponse createValidateAdvisorResponse() {
        return new ValidateAdvisorResponse();
    }

    /**
     * Create an instance of {@link ValidateStudent }
     * 
     */
    public ValidateStudent createValidateStudent() {
        return new ValidateStudent();
    }

    /**
     * Create an instance of {@link ValidateStudentResponse }
     * 
     */
    public ValidateStudentResponse createValidateStudentResponse() {
        return new ValidateStudentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCourse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCourse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "addCourse")
    public JAXBElement<AddCourse> createAddCourse(AddCourse value) {
        return new JAXBElement<AddCourse>(_AddCourse_QNAME, AddCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCourseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCourseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "addCourseResponse")
    public JAXBElement<AddCourseResponse> createAddCourseResponse(AddCourseResponse value) {
        return new JAXBElement<AddCourseResponse>(_AddCourseResponse_QNAME, AddCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCourse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCourse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "deleteCourse")
    public JAXBElement<DeleteCourse> createDeleteCourse(DeleteCourse value) {
        return new JAXBElement<DeleteCourse>(_DeleteCourse_QNAME, DeleteCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCourseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCourseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "deleteCourseResponse")
    public JAXBElement<DeleteCourseResponse> createDeleteCourseResponse(DeleteCourseResponse value) {
        return new JAXBElement<DeleteCourseResponse>(_DeleteCourseResponse_QNAME, DeleteCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayCourses }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayCourses }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "displayCourses")
    public JAXBElement<DisplayCourses> createDisplayCourses(DisplayCourses value) {
        return new JAXBElement<DisplayCourses>(_DisplayCourses_QNAME, DisplayCourses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayCoursesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayCoursesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "displayCoursesResponse")
    public JAXBElement<DisplayCoursesResponse> createDisplayCoursesResponse(DisplayCoursesResponse value) {
        return new JAXBElement<DisplayCoursesResponse>(_DisplayCoursesResponse_QNAME, DisplayCoursesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DropCourse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DropCourse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "dropCourse")
    public JAXBElement<DropCourse> createDropCourse(DropCourse value) {
        return new JAXBElement<DropCourse>(_DropCourse_QNAME, DropCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DropCourseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DropCourseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "dropCourseResponse")
    public JAXBElement<DropCourseResponse> createDropCourseResponse(DropCourseResponse value) {
        return new JAXBElement<DropCourseResponse>(_DropCourseResponse_QNAME, DropCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollCourse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnrollCourse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "enrollCourse")
    public JAXBElement<EnrollCourse> createEnrollCourse(EnrollCourse value) {
        return new JAXBElement<EnrollCourse>(_EnrollCourse_QNAME, EnrollCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollCourseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnrollCourseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "enrollCourseResponse")
    public JAXBElement<EnrollCourseResponse> createEnrollCourseResponse(EnrollCourseResponse value) {
        return new JAXBElement<EnrollCourseResponse>(_EnrollCourseResponse_QNAME, EnrollCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassSchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClassSchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "getClassSchedule")
    public JAXBElement<GetClassSchedule> createGetClassSchedule(GetClassSchedule value) {
        return new JAXBElement<GetClassSchedule>(_GetClassSchedule_QNAME, GetClassSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassScheduleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClassScheduleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "getClassScheduleResponse")
    public JAXBElement<GetClassScheduleResponse> createGetClassScheduleResponse(GetClassScheduleResponse value) {
        return new JAXBElement<GetClassScheduleResponse>(_GetClassScheduleResponse_QNAME, GetClassScheduleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitializeValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "initializeValues")
    public JAXBElement<InitializeValues> createInitializeValues(InitializeValues value) {
        return new JAXBElement<InitializeValues>(_InitializeValues_QNAME, InitializeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeValuesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitializeValuesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "initializeValuesResponse")
    public JAXBElement<InitializeValuesResponse> createInitializeValuesResponse(InitializeValuesResponse value) {
        return new JAXBElement<InitializeValuesResponse>(_InitializeValuesResponse_QNAME, InitializeValuesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCourseAvailability }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCourseAvailability }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "listCourseAvailability")
    public JAXBElement<ListCourseAvailability> createListCourseAvailability(ListCourseAvailability value) {
        return new JAXBElement<ListCourseAvailability>(_ListCourseAvailability_QNAME, ListCourseAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCourseAvailabilityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCourseAvailabilityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "listCourseAvailabilityResponse")
    public JAXBElement<ListCourseAvailabilityResponse> createListCourseAvailabilityResponse(ListCourseAvailabilityResponse value) {
        return new JAXBElement<ListCourseAvailabilityResponse>(_ListCourseAvailabilityResponse_QNAME, ListCourseAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCourses }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowCourses }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "showCourses")
    public JAXBElement<ShowCourses> createShowCourses(ShowCourses value) {
        return new JAXBElement<ShowCourses>(_ShowCourses_QNAME, ShowCourses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCoursesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowCoursesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "showCoursesResponse")
    public JAXBElement<ShowCoursesResponse> createShowCoursesResponse(ShowCoursesResponse value) {
        return new JAXBElement<ShowCoursesResponse>(_ShowCoursesResponse_QNAME, ShowCoursesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwapCourse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SwapCourse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "swapCourse")
    public JAXBElement<SwapCourse> createSwapCourse(SwapCourse value) {
        return new JAXBElement<SwapCourse>(_SwapCourse_QNAME, SwapCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwapCourseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SwapCourseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "swapCourseResponse")
    public JAXBElement<SwapCourseResponse> createSwapCourseResponse(SwapCourseResponse value) {
        return new JAXBElement<SwapCourseResponse>(_SwapCourseResponse_QNAME, SwapCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateAdvisor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateAdvisor }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "validateAdvisor")
    public JAXBElement<ValidateAdvisor> createValidateAdvisor(ValidateAdvisor value) {
        return new JAXBElement<ValidateAdvisor>(_ValidateAdvisor_QNAME, ValidateAdvisor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateAdvisorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateAdvisorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "validateAdvisorResponse")
    public JAXBElement<ValidateAdvisorResponse> createValidateAdvisorResponse(ValidateAdvisorResponse value) {
        return new JAXBElement<ValidateAdvisorResponse>(_ValidateAdvisorResponse_QNAME, ValidateAdvisorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "validateStudent")
    public JAXBElement<ValidateStudent> createValidateStudent(ValidateStudent value) {
        return new JAXBElement<ValidateStudent>(_ValidateStudent_QNAME, ValidateStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://course/", name = "validateStudentResponse")
    public JAXBElement<ValidateStudentResponse> createValidateStudentResponse(ValidateStudentResponse value) {
        return new JAXBElement<ValidateStudentResponse>(_ValidateStudentResponse_QNAME, ValidateStudentResponse.class, null, value);
    }

}
