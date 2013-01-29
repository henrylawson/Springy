package net.henrylawson.firstspringmvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Form {
	
	@Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters long")
	private String name;
	
	@NotNull(message = "Must be a number")
	private Integer age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
}
