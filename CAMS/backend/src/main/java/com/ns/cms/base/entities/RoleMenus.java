package com.ns.cms.base.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ns.cms.tos.common.BaseEntity;

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
@Table(schema="base", name= "role_menu")
public class RoleMenus extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roleMenuId;
	
	@Column(name = "menu_sequence")
	private long menuSequence;
	
	@ManyToOne
	@JoinColumn(name= "role_id")
	private Role role;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnoreProperties({"hibernatelazyinitializer", "handler", "roleMenus"})
	@JoinColumn(name= "menu_id")
	private Menu menu;
	
	
	
}
