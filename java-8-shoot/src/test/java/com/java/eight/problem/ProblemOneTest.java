package com.java.eight.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ProblemOneTest {

	@Test
	void shouldReturnListOfIntegerSum() {

		// Given
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		ProblemOne problemOne = new ProblemOne();

		// When
		int actual = problemOne.sum(numbers);
		int expected = 6;
		// Then
		assertEquals(expected, actual);

	}
	
	@Test
	void shouldReturnListOfIntegerSum_case_2() {

		// Given
		List<Integer> numbers = Arrays.asList(1, 2, -1);
		ProblemOne problemOne = new ProblemOne();

		// When
		int actual = problemOne.sum(numbers);
		int expected = 2;
		// Then
		assertEquals(expected, actual);

	}
	
	@Test
	void shouldReturnListOfIntegerSum_case_3() {

		// Given
		List<Integer> numbers = null;
		ProblemOne problemOne = new ProblemOne();
// () ->  throws Throwable;
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
			problemOne.sum(numbers);
		});
		
		assertEquals("numbers method parameter should not be null", ex.getMessage());

	}

}
