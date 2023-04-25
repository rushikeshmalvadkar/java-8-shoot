package com.java.eight.problem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemFive {
	/**
	 * get the name wich start with n
	 * 
	 * @param args
	 */
	public List<String> getNamesWithStartR(List<String> names) {
		if (names==null) {
			throw new IllegalArgumentException("mathod parameter should not me empty");
		}
		return names.stream().filter(name -> name.toLowerCase().startsWith("r")).collect(Collectors.toList());

	}
}
