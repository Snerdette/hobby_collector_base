package com.catalyst.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class FavoriteFood {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer food_id;
	
	
	@NotNull
	private String foodName;
	
	
	
	
	
}
