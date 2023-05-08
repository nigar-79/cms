package com.ns.cms.base.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ns.cms.tos.common.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(schema = "base", name = "branch", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "institute_code, branch_code" }) })
public class Branch extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long branchCode;

	@ManyToOne
	@JoinColumn(name = "institute_code", nullable = false)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler", "institute" })
	private Institute institute;

	@Column(name = "branch_name")
	private String branchName;

	@Column(name = "branch_type")
	private String branchType;

	@Column(name = "description")
	private String description;

	@Column(name = "contact_person_salutation")
	private String contactPersonSalutation;

	@Column(name = "contact_person_name")
	private String contactPersonName;

	@Column(name = "contact_person_email_id")
	private String contactPersonEmailId;

	@Column(name = "contact_person_phone_no")
	private String contactPersonPhoneNo;

	@Column(name = "password_expiry_days")
	private long passwordExpiryDays;

	@Column(name = "password_expiry_notify_days")
	private long passwordExpiryNotifyDays;

	@Column(name = "max_login_fail_count")
	private long maxLoginFailCount;

	@Column(name = "web_url")
	private String webUrl;

	@Column(name = "logo_path")
	private String logoPath;

	@Column(name = "address_line1")
	private String addressLine1;

	@Column(name = "address_line2")
	private String addressLine2;

	@Column(name = "address_line3")
	private String addressLine3;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "country_code")
	private String countryCode;

	@Column(name = "postal_code")
	private String postalCode;

	@Column(name = "tel_no")
	private String telNo;

	@Column(name = "fax_no")
	private String faxNo;

	@Column(name = "branch_start_date")
	private Date branchStartDate;

	@Column(name = "area_in_acres")
	private String areaInAcres;

	/**
	 * 
	 */
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the branchCode
	 */
	public long getBranchCode() {
		return branchCode;
	}

	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(long branchCode) {
		this.branchCode = branchCode;
	}

	/**
	 * @return the institute
	 */
	public Institute getInstitute() {
		return institute;
	}

	/**
	 * @param institute the institute to set
	 */
	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/**
	 * @return the branchType
	 */
	public String getBranchType() {
		return branchType;
	}

	/**
	 * @param branchType the branchType to set
	 */
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the contactPersonSalutation
	 */
	public String getContactPersonSalutation() {
		return contactPersonSalutation;
	}

	/**
	 * @param contactPersonSalutation the contactPersonSalutation to set
	 */
	public void setContactPersonSalutation(String contactPersonSalutation) {
		this.contactPersonSalutation = contactPersonSalutation;
	}

	/**
	 * @return the contactPersonName
	 */
	public String getContactPersonName() {
		return contactPersonName;
	}

	/**
	 * @param contactPersonName the contactPersonName to set
	 */
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	/**
	 * @return the contactPersonEmailId
	 */
	public String getContactPersonEmailId() {
		return contactPersonEmailId;
	}

	/**
	 * @param contactPersonEmailId the contactPersonEmailId to set
	 */
	public void setContactPersonEmailId(String contactPersonEmailId) {
		this.contactPersonEmailId = contactPersonEmailId;
	}

	/**
	 * @return the contactPersonPhoneNo
	 */
	public String getContactPersonPhoneNo() {
		return contactPersonPhoneNo;
	}

	/**
	 * @param contactPersonPhoneNo the contactPersonPhoneNo to set
	 */
	public void setContactPersonPhoneNo(String contactPersonPhoneNo) {
		this.contactPersonPhoneNo = contactPersonPhoneNo;
	}

	/**
	 * @return the passwordExpiryDays
	 */
	public long getPasswordExpiryDays() {
		return passwordExpiryDays;
	}

	/**
	 * @param passwordExpiryDays the passwordExpiryDays to set
	 */
	public void setPasswordExpiryDays(long passwordExpiryDays) {
		this.passwordExpiryDays = passwordExpiryDays;
	}

	/**
	 * @return the passwordExpiryNotifyDays
	 */
	public long getPasswordExpiryNotifyDays() {
		return passwordExpiryNotifyDays;
	}

	/**
	 * @param passwordExpiryNotifyDays the passwordExpiryNotifyDays to set
	 */
	public void setPasswordExpiryNotifyDays(long passwordExpiryNotifyDays) {
		this.passwordExpiryNotifyDays = passwordExpiryNotifyDays;
	}

	/**
	 * @return the maxLoginFailCount
	 */
	public long getMaxLoginFailCount() {
		return maxLoginFailCount;
	}

	/**
	 * @param maxLoginFailCount the maxLoginFailCount to set
	 */
	public void setMaxLoginFailCount(long maxLoginFailCount) {
		this.maxLoginFailCount = maxLoginFailCount;
	}

	/**
	 * @return the webUrl
	 */
	public String getWebUrl() {
		return webUrl;
	}

	/**
	 * @param webUrl the webUrl to set
	 */
	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	/**
	 * @return the logoPath
	 */
	public String getLogoPath() {
		return logoPath;
	}

	/**
	 * @param logoPath the logoPath to set
	 */
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the addressLine3
	 */
	public String getAddressLine3() {
		return addressLine3;
	}

	/**
	 * @param addressLine3 the addressLine3 to set
	 */
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the telNo
	 */
	public String getTelNo() {
		return telNo;
	}

	/**
	 * @param telNo the telNo to set
	 */
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	/**
	 * @return the faxNo
	 */
	public String getFaxNo() {
		return faxNo;
	}

	/**
	 * @param faxNo the faxNo to set
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	/**
	 * @return the branchStartDate
	 */
	public Date getBranchStartDate() {
		return branchStartDate;
	}

	/**
	 * @param branchStartDate the branchStartDate to set
	 */
	public void setBranchStartDate(Date branchStartDate) {
		this.branchStartDate = branchStartDate;
	}

	/**
	 * @return the areaInAcres
	 */
	public String getAreaInAcres() {
		return areaInAcres;
	}

	/**
	 * @param areaInAcres the areaInAcres to set
	 */
	public void setAreaInAcres(String areaInAcres) {
		this.areaInAcres = areaInAcres;
	}

}
