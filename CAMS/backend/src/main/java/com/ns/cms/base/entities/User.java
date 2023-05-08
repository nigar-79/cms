package com.ns.cms.base.entities;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ns.cms.tos.common.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(schema = "base", name = "user")
public class User extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "login_id")
	private String loginID;

	@Column(name = "password")
	private String password;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "phone_no")
	private String phoneno;

	@Column(name = "valid_from_dt")
	private Date ValidFromDt;

	@Column(name = "valid_to_dt")
	private Date ValidToDt;

	@Column(name = "account_locked")
	private String accountLocked;

	@Column(name = "last_login")
	private Date LastLogin;

	@Column(name = "user_type")
	private String userType;

	@Column(name = "allow_login")
	private boolean allowLogin;

	@Column(name = "login_failed_count")
	private long loginFailedCount;

	@Column(name = "is_super_user")
	private String isSuperUser;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "institute_code", referencedColumnName = "institute_code", nullable = false)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler", "institue" })
	private Institute institute;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "branch_code", referencedColumnName = "branch_code", nullable = false)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler", "branch" })
	private Branch branch;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler", "branch" })
	@JoinTable(schema="base", name="user_roles", joinColumns = @JoinColumn(name= "user_id", referencedColumnName = "user_id"), inverseJoinColumns = @JoinColumn(name= "role_id", referencedColumnName = "role_id"))
	private Collection<Role> roles;

	@JsonIgnoreProperties({"user"})
	@Transient
	private List<UserBranchAccess> userBranchAccessList;
	
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the loginID
	 */
	public String getLoginID() {
		return loginID;
	}

	/**
	 * @param loginID the loginID to set
	 */
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the phoneno
	 */
	public String getPhoneno() {
		return phoneno;
	}

	/**
	 * @param phoneno the phoneno to set
	 */
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	/**
	 * @return the validFromDt
	 */
	public Date getValidFromDt() {
		return ValidFromDt;
	}

	/**
	 * @param validFromDt the validFromDt to set
	 */
	public void setValidFromDt(Date validFromDt) {
		ValidFromDt = validFromDt;
	}

	/**
	 * @return the validToDt
	 */
	public Date getValidToDt() {
		return ValidToDt;
	}

	/**
	 * @param validToDt the validToDt to set
	 */
	public void setValidToDt(Date validToDt) {
		ValidToDt = validToDt;
	}

	/**
	 * @return the accountLocked
	 */
	public String getAccountLocked() {
		return accountLocked;
	}

	/**
	 * @param accountLocked the accountLocked to set
	 */
	public void setAccountLocked(String accountLocked) {
		this.accountLocked = accountLocked;
	}

	/**
	 * @return the lastLogin
	 */
	public Date getLastLogin() {
		return LastLogin;
	}

	/**
	 * @param lastLogin the lastLogin to set
	 */
	public void setLastLogin(Date lastLogin) {
		LastLogin = lastLogin;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the allowLogin
	 */
	public boolean isAllowLogin() {
		return allowLogin;
	}

	/**
	 * @param allowLogin the allowLogin to set
	 */
	public void setAllowLogin(boolean allowLogin) {
		this.allowLogin = allowLogin;
	}

	/**
	 * @return the loginFailedCount
	 */
	public long getLoginFailedCount() {
		return loginFailedCount;
	}

	/**
	 * @param loginFailedCount the loginFailedCount to set
	 */
	public void setLoginFailedCount(long loginFailedCount) {
		this.loginFailedCount = loginFailedCount;
	}

	/**
	 * @return the isSuperUser
	 */
	public String getIsSuperUser() {
		return isSuperUser;
	}

	/**
	 * @param isSuperUser the isSuperUser to set
	 */
	public void setIsSuperUser(String isSuperUser) {
		this.isSuperUser = isSuperUser;
	}

}
