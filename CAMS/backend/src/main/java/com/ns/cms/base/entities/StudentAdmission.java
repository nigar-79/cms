package com.ns.cms.base.entities;

import java.sql.Date;

import com.ns.cms.tos.common.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "base", name = "student_admission")
public class StudentAdmission extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long admissionId;

	@Column(name = "salutation")
	private String salutation;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "age")
	private String age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "current_address1")
	private String currentAddress1;

	@Column(name = "current_address2")
	private String currentAddress2;

	@Column(name = "current_address3")
	private String currentAddress3;

	@Column(name = "permanent_address1")
	private String permanent_address1;

	@Column(name = "permanent_address2")
	private String permanent_address2;

	@Column(name = "permanent_address3")
	private String permanent_address3;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "postal_code")
	private String postalCode;

	/**
	 * 
	 */
	public StudentAdmission() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the admissionId
	 */
	public long getAdmissionId() {
		return admissionId;
	}

	/**
	 * @param admission_id the admission_id to set
	 */
	public void setAdmission_id(long admissionId) {
		this.admissionId = admissionId;
	}

	/**
	 * @return the salutation
	 */
	public String getSalutation() {
		return salutation;
	}

	/**
	 * @param studentSalutation the studentSalutation to set
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the currentAddress1
	 */
	public String getCurrentAddress1() {
		return currentAddress1;
	}

	/**
	 * @param currentAddress1 the currentAddress1 to set
	 */
	public void setCurrentAddress1(String currentAddress1) {
		this.currentAddress1 = currentAddress1;
	}

	/**
	 * @return the currentAddress2
	 */
	public String getCurrentAddress2() {
		return currentAddress2;
	}

	/**
	 * @param currentAddress2 the currentAddress2 to set
	 */
	public void setCurrentAddress2(String currentAddress2) {
		this.currentAddress2 = currentAddress2;
	}

	/**
	 * @return the currentAddress3
	 */
	public String getCurrentAddress3() {
		return currentAddress3;
	}

	/**
	 * @param currentAddress3 the currentAddress3 to set
	 */
	public void setCurrentAddress3(String currentAddress3) {
		this.currentAddress3 = currentAddress3;
	}

	/**
	 * @return the permanent_address1
	 */
	public String getPermanent_address1() {
		return permanent_address1;
	}

	/**
	 * @param permanent_address1 the permanent_address1 to set
	 */
	public void setPermanent_address1(String permanent_address1) {
		this.permanent_address1 = permanent_address1;
	}

	/**
	 * @return the permanent_address2
	 */
	public String getPermanent_address2() {
		return permanent_address2;
	}

	/**
	 * @param permanent_address2 the permanent_address2 to set
	 */
	public void setPermanent_address2(String permanent_address2) {
		this.permanent_address2 = permanent_address2;
	}

	/**
	 * @return the permanent_address3
	 */
	public String getPermanent_address3() {
		return permanent_address3;
	}

	/**
	 * @param permanent_address3 the permanent_address3 to set
	 */
	public void setPermanent_address3(String permanent_address3) {
		this.permanent_address3 = permanent_address3;
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

}
