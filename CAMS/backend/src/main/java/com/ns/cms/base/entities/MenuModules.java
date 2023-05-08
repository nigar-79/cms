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

@Entity
@Table(schema = "base", name = "menu_modules")
public class MenuModules extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long menuModulesId;
	
	@Column(name="module_sequence")
	private long moduleSequence;
	
	@ManyToOne
	@JoinColumn(name= "module_id")
	@JsonIgnoreProperties("menuModules")
	private Module module;
		
}
