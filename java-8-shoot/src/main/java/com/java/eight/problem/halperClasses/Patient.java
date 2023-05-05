package com.java.eight.problem.halperClasses;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class Patient {
	
	private String name;
	private Integer age;
	private String disease;
	
	public Patient(String name, Integer age,String disease) {
		this.name=name;
		this.age=age;
		this.disease=disease;
	}

}
