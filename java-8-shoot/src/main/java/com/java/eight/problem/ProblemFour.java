package com.java.eight.problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemFour {
    /**
     * java 8 program to Print Strings whose length is greater than 3 in List.
     * boolean test(T t)
     */
	
	public  List<String> getNamesWithLengthGretarThenThree(List<String> names) {
		if(names==null) {
			throw new IllegalArgumentException();
		}
		List<String> result = names.stream().filter((name)->name.length()>3).collect(Collectors.toList());
		return result;
	}
}
