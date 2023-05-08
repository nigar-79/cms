package com.ns.cms.base.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(schema = "base", name = "user_branch_access")
public class UserBranchAccess {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userBranchAccessId;

	@Column(name = "default_branch")
	private boolean defaultBranch;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "institute_code", referencedColumnName = "institute_code")
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler", "institue" })
	private Institute institute;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "branch_code", referencedColumnName = "branch_code", nullable = false)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler" })
	private Branch branch;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler" })
	private User user;

	/**
	 * 
	 */
	public UserBranchAccess() {
		super();
	}

	/**
	 * @return the userBranchAccessId
	 */
	public long getUserBranchAccessId() {
		return userBranchAccessId;
	}

	/**
	 * @param userBranchAccessId the userBranchAccessId to set
	 */
	public void setUserBranchAccessId(long userBranchAccessId) {
		this.userBranchAccessId = userBranchAccessId;
	}

	/**
	 * @return the defaultBranch
	 */
	public boolean isDefaultBranch() {
		return defaultBranch;
	}

	/**
	 * @param defaultBranch the defaultBranch to set
	 */
	public void setDefaultBranch(boolean defaultBranch) {
		this.defaultBranch = defaultBranch;
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
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
