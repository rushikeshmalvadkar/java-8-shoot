package com.java.eight.problem;

import java.util.List;
import java.util.stream.Collectors;

public class ProblemTwo {
	/**
	 * input ["abhi","rushi"] output [4,5]
	 */
	public List<Integer> countLengthOfListOfName(List<String> names) {

		if (names == null) {
			throw new IllegalArgumentException("names method parameter should not be null");
		}

		List<Integer> lengths = names.stream().map(name -> name.length()).collect(Collectors.toList());
		return lengths;
	}
}
