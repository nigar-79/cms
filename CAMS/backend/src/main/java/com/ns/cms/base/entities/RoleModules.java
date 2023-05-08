package com.ns.cms.base.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ns.cms.tos.common.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class RoleModules extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roleModuleId;

	@Column(name = "create_flag")
	private boolean createFlag;

	@Column(name = "delete_flag")
	private boolean deleteFlag;

	@Column(name = "edit_flag")
	private boolean editFlag;

	@Column(name = "read_flag")
	private boolean readFlag;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "institute_code", referencedColumnName = "institute_code", nullable = false)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler" })
	private Institute institute;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnoreProperties(value = { "hibernatelazyinitializer", "handler", "menuModules",
			"roleModules" }, allowSetters = true)
	@JoinColumn(name = "module_id")
	private Module module;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "role_id")
	private Role role;

}
