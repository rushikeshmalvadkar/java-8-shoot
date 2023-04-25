package com.java.eight.problem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;

class ProblemFiveTest {

	@Test
	void getNamesWithStartR() {
		List<String> names = Arrays.asList("rushikesh","sunita","ramesh","roshan","ranoji","sunitr");
		ProblemFive problemFive = new ProblemFive();
		List<String> expected = Arrays.asList("rushikesh","ramesh","roshan","ranoji");
		assertEquals(expected,problemFive.getNamesWithStartR(names));
		
	}
	@Test
	void getNamesWithStart2() {
		List<String> names = Arrays.asList("sunita","sunitr");
		ProblemFive problemFive = new ProblemFive();
		List<String> expected = Arrays.asList();
		assertEquals(expected,problemFive.getNamesWithStartR(names));
		
	}
	
	@Test
	void getNamesWithStart3() {
		//List<String> names = Arrays.asList("sunita","sunitr");
		ProblemFive problemFive = new ProblemFive();
		List<String> expected = Arrays.asList();
       assertThrows(IllegalArgumentException.class, ()->problemFive.getNamesWithStartR(null));		
	}
}
