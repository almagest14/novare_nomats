package hk.com.novare.nomats.candidate;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "candidate")
@NamedQuery(name = Candidate.FIND_BY_ID, query = "select a from Candidate a where a.id = :id")
public class Candidate implements java.io.Serializable {

	public static final String FIND_BY_ID = "Candidate.findById";

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "firstName")
	@NotEmpty
	protected String firstName;

	@Column(name = "middleName")
	protected String middleName;

	@Column(name = "lastName")
	@NotEmpty
	protected String lastName;

	@Column(name = "nickName")
	protected String nickName;

	@Column(name = "birthDate")
	@NotEmpty
	protected Date birthDate;

	@Column(name = "address1")
	@NotEmpty
	protected String address1;

	@Column(name = "address2")
	protected String address2;

	@Column(name = "primaryEmail")
	@NotEmpty
	protected String primaryEmail;

	@Column(name = "secondaryEmail")
	@NotEmpty
	protected String secondaryEmail;

	@Column(name = "sssNumber")
	@NotEmpty
	protected int sssNumber;

	@Column(name = "tinNumber")
	@NotEmpty
	protected int tinNumber;

	@Column(name = "hdmfNumber")
	@NotEmpty
	protected int hdmfNumber;

	@Column(name = "homePhone")
	@NotEmpty
	protected String homePhone;

	@Column(name = "workPhone")
	@NotEmpty
	protected String workPhone;

	@Column(name = "mobilePhone1")
	@NotEmpty
	protected String mobilePhone1;

	@Column(name = "mobilePhone2")
	protected String mobilePhone2;

	@Column(name = "applicationStatus")
	@NotEmpty
	protected String applicationStatus;

	@Column(name = "yearsOfExperience")
	@NotEmpty
	protected int yearsOfExperience;

	@Column(name = "sourcingChannel")
	@NotEmpty
	protected String sourcingChannel;

	@Column(name = "referredBy")
	@NotEmpty
	protected String referredBy;

	@Column(name = "educationalAttainment")
	@NotEmpty
	protected String educationalAttainment;

	@Column(name = "preferredEmployment")
	@NotEmpty
	protected String preferredEmployment;

	@Column(name = "currentSalary")
	@NotEmpty
	protected BigDecimal currentSalary;

	@Column(name = "expectedSalary")
	@NotEmpty
	protected BigDecimal expectedSalary;

	@Column(name = "pagibigNumber")
	@NotEmpty
	protected int pagibigNumber;

	@Column(name = "philhealthNumber")
	@NotEmpty
	protected int philhealthNumber;

	@Column(name = "startDate")
    @NotEmpty
    protected Date startDate;

	@Column(name = "endDate")
    @NotEmpty
    protected Date endDate;

    @Column(name = "accountManagerId")
    @NotEmpty
    protected Long accountManagerId;

	@Column(name = "jobId")
    @NotEmpty
    protected Long jobId;

	@Column(name = "humanResourceId")
	@NotEmpty
	protected Long humanResourceId;

	@Column(name = "departmentId")
	@NotEmpty
	protected Long departmentId;

	@Column(name = "employeeTypeId")
	@NotEmpty
	protected Long employeeTypeId;

	@Column(name = "statusId")
	@NotEmpty
	protected Long statusId;

	@Column(name = "skillId")
	@NotEmpty
	protected Long skillId;

	@Column(name = "noteId")
	@NotEmpty
	protected Long noteId;

	protected Candidate() {}

    public Candidate(String firstName, String lastName, String middleName, String nickName, Date birthDate, String address1, String address2, String primaryEmail, String secondaryEmail, int sssNumber, int tinNumber, int hdmfNumber, String homePhone, String workPhone, String mobilePhone1, String mobilePhone2, String applicationStatus, int yearsOfExperience, String sourcingChannel, String referredBy, String educationalAttainment, String preferredEmployment, BigDecimal currentSalary, BigDecimal expectedSalary, int pagibigNumber, int philhealthNumber, Date startDate, Date endDate, Long accountManagerId, Long jobId, Long humanResourceId, Long departmentId, Long employeeTypeId, Long statusId, Long skillId, Long noteId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.nickName = nickName;
        this.birthDate = birthDate;
        this.address1 = address1;
        this.address2 = address2;
        this.primaryEmail = primaryEmail;
        this.secondaryEmail = secondaryEmail;
        this.sssNumber = sssNumber;
        this.tinNumber = tinNumber;
        this.hdmfNumber = hdmfNumber;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.mobilePhone1 = mobilePhone1;
        this.mobilePhone2 = mobilePhone2;
        this.applicationStatus = applicationStatus;
        this.yearsOfExperience = yearsOfExperience;
        this.sourcingChannel = sourcingChannel;
        this.referredBy = referredBy;
        this.educationalAttainment = educationalAttainment;
        this.preferredEmployment = preferredEmployment;
        this.currentSalary = currentSalary;
        this.expectedSalary = expectedSalary;
        this.pagibigNumber = pagibigNumber;
        this.philhealthNumber = philhealthNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.accountManagerId = accountManagerId;
        this.jobId = jobId;
        this.humanResourceId = humanResourceId;
        this.departmentId = departmentId;
        this.employeeTypeId = employeeTypeId;
        this.statusId = statusId;
        this.skillId = skillId;
        this.noteId = noteId;
    }

	public Long getId() {
		return id;
	}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public int getSssNumber() {
        return sssNumber;
    }

    public void setSssNumber(int sssNumber) {
        this.sssNumber = sssNumber;
    }

    public int getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(int tinNumber) {
        this.tinNumber = tinNumber;
    }

    public int getHdmfNumber() {
        return hdmfNumber;
    }

    public void setHdmfNumber(int hdmfNumber) {
        this.hdmfNumber = hdmfNumber;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getMobilePhone1() {
        return mobilePhone1;
    }

    public void setMobilePhone1(String mobilePhone1) {
        this.mobilePhone1 = mobilePhone1;
    }

    public String getMobilePhone2() {
        return mobilePhone2;
    }

    public void setMobilePhone2(String mobilePhone2) {
        this.mobilePhone2 = mobilePhone2;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSourcingChannel() {
        return sourcingChannel;
    }

    public void setSourcingChannel(String sourcingChannel) {
        this.sourcingChannel = sourcingChannel;
    }

    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }

    public String getEducationalAttainment() {
        return educationalAttainment;
    }

    public void setEducationalAttainment(String educationalAttainment) {
        this.educationalAttainment = educationalAttainment;
    }

    public String getPreferredEmployment() {
        return preferredEmployment;
    }

    public void setPreferredEmployment(String preferredEmployment) {
        this.preferredEmployment = preferredEmployment;
    }

    public BigDecimal getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(BigDecimal currentSalary) {
        this.currentSalary = currentSalary;
    }

    public BigDecimal getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(BigDecimal expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public int getPagibigNumber() {
        return pagibigNumber;
    }

    public void setPagibigNumber(int pagibigNumber) {
        this.pagibigNumber = pagibigNumber;
    }

    public int getPhilhealthNumber() {
        return philhealthNumber;
    }

    public void setPhilhealthNumber(int philhealthNumber) {
        this.philhealthNumber = philhealthNumber;
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

    public Long getAccountManagerId() {
        return accountManagerId;
    }

    public void setAccountManagerId(Long accountManagerId) {
        this.accountManagerId = accountManagerId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getHumanResourceId() {
        return humanResourceId;
    }

    public void setHumanResourceId(Long humanResourceId) {
        this.humanResourceId = humanResourceId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getEmployeeTypeId() {
        return employeeTypeId;
    }

    public void setEmployeeTypeId(Long employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }


}

