package com.catalyst.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer animal_id;
	
	
	@NotNull
	private String animalName;
	
	
	@NotNull
	private String scientificName;
	
	
	@NotNull
	@ManyToOne  //could be OneToOne - one animal can have one favFood
	private FavoriteFood foodName;
	
	
	@NotNull
	private String infoLink;
	
	
	@NotNull
	@OneToOne
	private AnimalEnclosure enclosureName;

	

	//GETTERS AND SETTERS FOR ANIMAL ENTITY	
	public FavoriteFood getFoodName() {
		return foodName;
	}


	public void setFoodName(FavoriteFood foodName) {
		this.foodName = foodName;
	}
	
	
	public Integer getAnimal_id() {
		return animal_id;
	}


	public void setAnimal_id(Integer animal_id) {
		this.animal_id = animal_id;
	}


	public String getAnimalName() {
		return animalName;
	}


	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}


	public String getScientificName() {
		return scientificName;
	}


	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}


	public String getInfoLink() {
		return infoLink;
	}


	public void setInfoLink(String infoLink) {
		this.infoLink = infoLink;
	}


	public AnimalEnclosure getEnclosureName() {
		return enclosureName;
	}


	public void setEnclosureName(AnimalEnclosure enclosureName) {
		this.enclosureName = enclosureName;
	}
	
	
}
