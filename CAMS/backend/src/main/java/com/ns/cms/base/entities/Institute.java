package com.ns.cms.base.entities;

import java.util.Date;

import com.ns.cms.tos.common.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "base", name = "institute")
public class Institute extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String instituteCode;

	@Column(name = "institute_name")
	private String instituteName;

	@Column(name = "institute_type")
	private String instituteType;

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

	@Column(name = "institute_start_date")
	private Date instituteStartDate;

	@Column(name = "area_in_acres")
	private double areaInAcres;

	/**
	 * 
	 */
	public Institute() {
		super();
	}

	/**
	 * @return the instituteCode
	 */
	public String getInstituteCode() {
		return instituteCode;
	}

	/**
	 * @param instituteCode the instituteCode to set
	 */
	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}

	/**
	 * @return the instituteName
	 */
	public String getInstituteName() {
		return instituteName;
	}

	/**
	 * @param instituteName the instituteName to set
	 */
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	/**
	 * @return the instituteType
	 */
	public String getInstituteType() {
		return instituteType;
	}

	/**
	 * @param instituteType the instituteType to set
	 */
	public void setInstituteType(String instituteType) {
		this.instituteType = instituteType;
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
	 * @return the instituteStartDate
	 */
	public Date getInstituteStartDate() {
		return instituteStartDate;
	}

	/**
	 * @param instituteStartDate the instituteStartDate to set
	 */
	public void setInstituteStartDate(Date instituteStartDate) {
		this.instituteStartDate = instituteStartDate;
	}

	/**
	 * @return the areaInAcres
	 */
	public double getAreaInAcres() {
		return areaInAcres;
	}

	/**
	 * @param areaInAcres the areaInAcres to set
	 */
	public void setAreaInAcres(double areaInAcres) {
		this.areaInAcres = areaInAcres;
	}

}
