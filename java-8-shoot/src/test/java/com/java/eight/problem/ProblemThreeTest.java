package com.java.eight.problem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ProblemThreeTest {

    @Test 
	void getMaxValueTest1() {
		List<Integer> numbers = Arrays.asList(2,4,5,6,10);
		ProblemThree problemThree = new ProblemThree();
		Integer expected=10;
		assertEquals(expected, problemThree.getMaxValue(numbers));
	}
	@Test
	void getMaxValueTest2() {
		List<Integer> numbers = Arrays.asList(2,4,5,6);
		ProblemThree problemThree = new ProblemThree();
		Integer expected=6;
		assertEquals(expected, problemThree.getMaxValue(numbers));
	}
	@Test
	void getMaxValueTest3() {
		List<Integer> numbers = Arrays.asList(2,4,5,6);
		ProblemThree problemThree = new ProblemThree();
		Integer expected=6;
		assertEquals(expected, problemThree.getMaxValue(numbers));
	}
	@Test
	void getMaxValueTest4() {
		ProblemThree problemThree = new ProblemThree();
		assertThrows(IllegalArgumentException.class,()->problemThree.getMaxValue(null) );
	}
	
	
	
	

}
