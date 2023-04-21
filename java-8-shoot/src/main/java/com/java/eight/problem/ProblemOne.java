package com.java.eight.problem;

import java.util.List;
import java.util.stream.IntStream;

public class ProblemOne {

	/**
	 * Return a sum of given list of integers
	 * 
	 * Input : [1 , 2 ,4] Output : 7
	 * 
	 * @return
	 */
	public int sum(List<Integer> numbers) {

		if (numbers == null) {
			throw new IllegalArgumentException("numbers method parameter should not be null");
		}
		// (number) -> number;
		IntStream numbersIntStream = numbers.stream().mapToInt(number -> number);

		int sum = numbersIntStream.sum();
		return sum;
		
	}

}
