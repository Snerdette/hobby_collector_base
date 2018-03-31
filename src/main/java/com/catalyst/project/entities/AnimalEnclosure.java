package com.catalyst.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class AnimalEnclosure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer enclosure_id;
	
	
	@NotNull
	private String enclosureName;
	
	
	@NotNull
	@OneToOne //could be OneToMany?  One enclosure can have many animals (of same type?)
	private Animal animalName;
	private Integer occupancy;
	private String feedingTime;
	
	
//	@NotNull
//	//@ManyToOne //could be  OneToOne?  One enclosure can have one condition?
//	private EnclosureCondition condition;
	
	
	
	
	
	
	
	
	
	
}
