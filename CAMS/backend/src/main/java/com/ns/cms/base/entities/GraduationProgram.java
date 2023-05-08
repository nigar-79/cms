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
@Table(schema = "base", name = "graduation_program")
public class GraduationProgram extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long graduationProgramId;

	@Column(name = "graduation_name")
	private long graduationName;

	@Column(name = "graduation_type_added_date")
	private Date graduationTypeAddedDate;

	@Column(name = "description")
	private long description;

	/**
	 * 
	 */
	public GraduationProgram() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the graduationProgramId
	 */
	public long getGraduationProgramId() {
		return graduationProgramId;
	}

	/**
	 * @param graduationProgramId the graduationProgramId to set
	 */
	public void setGraduationProgramId(long graduationProgramId) {
		this.graduationProgramId = graduationProgramId;
	}

	/**
	 * @return the graduationName
	 */
	public long getGraduationName() {
		return graduationName;
	}

	/**
	 * @param graduationName the graduationName to set
	 */
	public void setGraduationName(long graduationName) {
		this.graduationName = graduationName;
	}

	/**
	 * @return the graduationTypeAddedDate
	 */
	public Date getGraduationTypeAddedDate() {
		return graduationTypeAddedDate;
	}

	/**
	 * @param graduationTypeAddedDate the graduationTypeAddedDate to set
	 */
	public void setGraduationTypeAddedDate(Date graduationTypeAddedDate) {
		this.graduationTypeAddedDate = graduationTypeAddedDate;
	}

	/**
	 * @return the description
	 */
	public long getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(long description) {
		this.description = description;
	}

}
