package com.java.eight.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ProblemTwoTest {

	@Test
	void countLengthOfListOfNameTest1() {
		List<String> names = Arrays.asList("rushkesh", "sunita");
		ProblemTwo problemTwo = new ProblemTwo();
		List<Integer> actual = problemTwo.countLengthOfListOfName(names);
		List<Integer> expected = Arrays.asList(8, 6);
		assertEquals(expected, actual);
	}

	@Test
	void countLengthOfListOfNameTest2() {
		List<String> names = Arrays.asList("rushkesh");
		ProblemTwo problemTwo = new ProblemTwo();
		List<Integer> actual = problemTwo.countLengthOfListOfName(names);
		List<Integer> expected = Arrays.asList(8);
		assertEquals(expected, actual);
	}

	@Test
	void countLengthOfListOfNameTest3() {
		List<String> names = Arrays.asList("", "");
		ProblemTwo problemTwo = new ProblemTwo();
		List<Integer> actual = problemTwo.countLengthOfListOfName(names);
		List<Integer> expected = Arrays.asList(0, 0);
		assertEquals(expected, actual);
	}

	@Test
	void countLengthOfListOfNameTest4() {
		List<String> names = null;
		ProblemTwo problemTwo = new ProblemTwo();
		assertThrows(IllegalArgumentException.class,()->
		{
			problemTwo.countLengthOfListOfName(names);
			});
	}

}
