package hk.com.novare.nomats.job;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "job")
@NamedQuery(name = Job.FIND_BY_ID, query = "select a from Job a where a.id = :id")
public class Job implements java.io.Serializable {

    public static final String FIND_BY_ID = "Job.findById";

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "clientAddress")
    @NotEmpty
    protected String clientAddress;

    @Column(name = "clientHiringManager")
    @NotEmpty
    protected String clientHiringManager;

    @Column(name = "clientEmail")
    @NotEmpty
    protected String clientEmail;

    @Column(name = "contactNumber")
    @NotEmpty
    protected String contactNumber;

    @Column(name = "weekStart")
    @NotEmpty
    protected String weekStart;

    @Column(name = "weekEnd")
    @NotEmpty
    protected String weekEnd;

    @Column(name = "timeIn")
    @NotEmpty
    protected Date timeIn;

    @Column(name = "timeOut")
    @NotEmpty
    protected Date timeOut;

    @Column(name = "startDate")
    @NotEmpty
    protected Date startDate;

    @Column(name = "endDate")
    @NotEmpty
    protected Date endDate;

    @Column(name = "dateRequest")
    @NotEmpty
    protected Date dateRequest;

    @Column(name = "jobFolder")
    @NotEmpty
    protected String jobFolder;

    @Column(name = "jobStatus")
    @NotEmpty
    protected String jobStatus;

    @Column(name = "employmentType")
    @NotEmpty
    protected String employmentType;

    @Column(name = "hiringRequirementQuantity")
    @NotEmpty
    protected int hiringRequirementQuantity;

    @Column(name = "newOrBackfill")
    @NotEmpty
    protected String newOrBackfill;

    @Column(name = "personToBackfill")
    @NotEmpty
    protected String personToBackfill;

    @Column(name = "educationalRequirement")
    @NotEmpty
    protected String educationalRequirement;

    @Column(name = "salesOrderNumber")
    @NotEmpty
    protected int salesOrderNumber;

    @Column(name = "maximumSalary")
    @NotEmpty
    protected BigDecimal maximumSalary;

    @Column(name = "minimumSalary")
    @NotEmpty
    protected BigDecimal minimumSalary;

    @Column(name = "accountManagerId")
    @NotEmpty
    protected Long accountManagerId;

    @Column(name = "titleId")
    @NotEmpty
    protected Long titleId;

    @Column(name = "candidateId")
    @NotEmpty
    protected Long candidateId;

    @Column(name = "departmentId")
    @NotEmpty
    protected Long departmentId;

    @Column(name = "noteId")
    @NotEmpty
    protected Long noteId;

    protected Job() {}

    public Job(String clientAddress, String clientHiringManager, String clientEmail, String contactNumber, String weekStart, String weekEnd, Date timeIn, Date timeOut, Date startDate, Date endDate, Date dateRequest, String jobFolder, String jobStatus, String employmentType, int hiringRequirementQuantity, String newOrBackfill, String personToBackfill, String educationalRequirement, int salesOrderNumber, BigDecimal maximumSalary, BigDecimal minimumSalary, Long accountManagerId, Long titleId, Long candidateId, Long departmentId, Long noteId){
        this.clientAddress = clientAddress;
        this.clientHiringManager = clientHiringManager;
        this.clientEmail = clientEmail;
        this.contactNumber = contactNumber;
        this.weekStart = weekStart;
        this.weekEnd = weekEnd;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateRequest = dateRequest;
        this.jobFolder = jobFolder;
        this.jobStatus = jobStatus;
        this.employmentType = employmentType;
        this.hiringRequirementQuantity = hiringRequirementQuantity;
        this.newOrBackfill = newOrBackfill;
        this.personToBackfill = personToBackfill;
        this.educationalRequirement = educationalRequirement;
        this.salesOrderNumber = salesOrderNumber;
        this.maximumSalary = maximumSalary;
        this.minimumSalary = minimumSalary;
        this.accountManagerId = accountManagerId;
        this.titleId = titleId;
        this.candidateId = candidateId;
        this.departmentId = departmentId;
        this.noteId = noteId;
    }

    public Long getId() {
        return id;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getWeekStart() {
        return weekStart;
    }

    public void setWeekStart(String weekStart) {
        this.weekStart = weekStart;
    }

    public String getWeekEnd() {
        return weekEnd;
    }

    public void setWeekEnd(String weekEnd) {
        this.weekEnd = weekEnd;
    }

    public Date getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Date timeIn) {
        this.timeIn = timeIn;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(Date dateRequest) {
        this.dateRequest = dateRequest;
    }

    public String getJobFolder() {
        return jobFolder;
    }

    public void setJobFolder(String jobFolder) {
        this.jobFolder = jobFolder;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public int getHiringRequirementQuantity() {
        return hiringRequirementQuantity;
    }

    public void setHiringRequirementQuantity(int hiringRequirementQuantity) {
        this.hiringRequirementQuantity = hiringRequirementQuantity;
    }

    public String getNewOrBackfill() {
        return newOrBackfill;
    }

    public void setNewOrBackfill(String newOrBackfill) {
        this.newOrBackfill = newOrBackfill;
    }

    public String getPersonToBackfill() {
        return personToBackfill;
    }

    public void setPersonToBackfill(String personToBackfill) {
        this.personToBackfill = personToBackfill;
    }

    public String getEducationalRequirement() {
        return educationalRequirement;
    }

    public void setEducationalRequirement(String educationalRequirement) {
        this.educationalRequirement = educationalRequirement;
    }

    public int getSalesOrderNumber() {
        return salesOrderNumber;
    }

    public void setSalesOrderNumber(int salesOrderNumber) {
        this.salesOrderNumber = salesOrderNumber;
    }

    public BigDecimal getMaximumSalary() {
        return maximumSalary;
    }

    public void setMaximumSalary(BigDecimal maximumSalary) {
        this.maximumSalary = maximumSalary;
    }

    public BigDecimal getMinimumSalary() {
        return minimumSalary;
    }

    public void setMinimumSalary(BigDecimal minimumSalary) {
        this.minimumSalary = minimumSalary;
    }

    public Long getAccountManagerId() {
        return accountManagerId;
    }

    public void setAccountManagerId(Long accountManagerId) {
        this.accountManagerId = accountManagerId;
    }

    public Long getTitleId() {
        return titleId;
    }

    public void setTitleId(Long titleId) {
        this.titleId = titleId;
    }

     public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getClientHiringManager() {
        return clientHiringManager;
    }

    public void setClientHiringManager(String clientHiringManager) {
        this.clientHiringManager = clientHiringManager;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


}

