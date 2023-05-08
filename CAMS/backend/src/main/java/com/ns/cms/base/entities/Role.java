package com.ns.cms.base.entities;

import java.util.Collection;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(schema="base", name="role")
public class Role extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roleId;
	
	@Column(name = "name")
	private String name;

	@Column(name = "user_type")
	private String userType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "institute_code", referencedColumnName = "institute_code", nullable = false)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler" })
	private Institute institute;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "branch_code", nullable = false)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler", "branch" })
	private Branch branch;
	
	@OneToMany(cascade = { CascadeType.DETACH})
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler", "role" })
	@JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID", insertable = false, updatable=false)
	private Collection<RoleMenus> roleMenus;
	
	@OneToMany(cascade = { CascadeType.DETACH})
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnoreProperties(value = { "hibernatelazyinitializer", "handler", "role" }, allowSetters= true)
	@JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID", insertable = false, updatable=false)
	private Collection<RoleModules> roleModules;
	
	
}
