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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(schema = "base", name= "menu")
public class Menu extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long menuId;
	
	@Column(name = "key")
	private String key;
	
	@Column(name = "icon_name")
	private String iconName;
	
	@Column(name = "menu_routing_path")
	private String menuRoutingPath;
	
	@Column(name = "user_type")
	private String userType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "institute_code", referencedColumnName = "institute_code", nullable = false)
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler" })
	private Institute institute;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(schema = "base", name= "menu_modules",
	joinColumns = @JoinColumn(name= "menu_id", referencedColumnName = "menu_id"),
	inverseJoinColumns = @JoinColumn(name="menu_modules_id", referencedColumnName = "menu_modules_id"))
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler" })
	private Collection<MenuModules> menuModules;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(schema = "base", name= "menu_modules",
	joinColumns = @JoinColumn(name= "menu_id", referencedColumnName = "menu_id"),
	inverseJoinColumns = @JoinColumn(name="menu_modules_id", referencedColumnName = "menu_modules_id"))
	@JsonIgnoreProperties({ "hibernatelazyinitializer", "handler" })
	private Collection<RoleMenus> roleMenus;

}
