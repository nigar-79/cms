package com.ns.cms.base.entities;

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
@Table(schema = "base", name = "bank_details", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "bank_code, bank_account" }) })
public class BankDetails extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bankId;

	@ManyToOne
	@JoinColumn(name = "institute_code", nullable = false)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler", "institute" })
	private Institute institute;

	@ManyToOne
	@JoinColumn(name = "branch_code", nullable = false)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler", "branch" })
	private Branch branch;

	@Column(name = "bank_code")
	private String bankCode;

	@Column(name = "bank_account")
	private String bankAccount;

	@Column(name = "account_holder")
	private String accountHolder;

	@Column(name = "bank_key")
	private String bankKey;

	@Column(name = "vat_reg_no")
	private String vatRegNo;

	@Column(name = "vat_reg_no2")
	private String vatRegNo2;

	@Column(name = "vat_reg_no3")
	private String vatRegNo3;

	@Column(name = "bank_name")
	private String bankName;

	@Column(name = "branch")
	private String bankBranch;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "address3")
	private String address3;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "counry_code")
	private String counryCode;

	@Column(name = "postal_code")
	private String postalCode;

	/**
	 * 
	 */
	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the bankId
	 */
	public long getBankId() {
		return bankId;
	}

	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(long bankId) {
		this.bankId = bankId;
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
	 * @return the branch
	 */
	public Branch getBranch() {
		return branch;
	}

	/**
	 * @param branch the branch to set
	 */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}

	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	/**
	 * @return the bankAccount
	 */
	public String getBankAccount() {
		return bankAccount;
	}

	/**
	 * @param bankAccount the bankAccount to set
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	/**
	 * @return the accountHolder
	 */
	public String getAccountHolder() {
		return accountHolder;
	}

	/**
	 * @param accountHolder the accountHolder to set
	 */
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	/**
	 * @return the bankKey
	 */
	public String getBankKey() {
		return bankKey;
	}

	/**
	 * @param bankKey the bankKey to set
	 */
	public void setBankKey(String bankKey) {
		this.bankKey = bankKey;
	}

	/**
	 * @return the vatRegNo
	 */
	public String getVatRegNo() {
		return vatRegNo;
	}

	/**
	 * @param vatRegNo the vatRegNo to set
	 */
	public void setVatRegNo(String vatRegNo) {
		this.vatRegNo = vatRegNo;
	}

	/**
	 * @return the vatRegNo2
	 */
	public String getVatRegNo2() {
		return vatRegNo2;
	}

	/**
	 * @param vatRegNo2 the vatRegNo2 to set
	 */
	public void setVatRegNo2(String vatRegNo2) {
		this.vatRegNo2 = vatRegNo2;
	}

	/**
	 * @return the vatRegNo3
	 */
	public String getVatRegNo3() {
		return vatRegNo3;
	}

	/**
	 * @param vatRegNo3 the vatRegNo3 to set
	 */
	public void setVatRegNo3(String vatRegNo3) {
		this.vatRegNo3 = vatRegNo3;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the bankBranch
	 */
	public String getBankBranch() {
		return bankBranch;
	}

	/**
	 * @param bankBranch the bankBranch to set
	 */
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the address3
	 */
	public String getAddress3() {
		return address3;
	}

	/**
	 * @param address3 the address3 to set
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
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
	 * @return the counryCode
	 */
	public String getCounryCode() {
		return counryCode;
	}

	/**
	 * @param counryCode the counryCode to set
	 */
	public void setCounryCode(String counryCode) {
		this.counryCode = counryCode;
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
