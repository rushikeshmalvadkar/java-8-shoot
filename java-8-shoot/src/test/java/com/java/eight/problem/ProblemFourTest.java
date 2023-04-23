package com.java.eight.problem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class ProblemFourTest {

	@Test
	void getNamesWithLengthGretarThenThreeOne() {
		List<String> names =Arrays.asList("ruhsikesh","abhi","a","sunita","malvadkar");
		ProblemFour problemFour = new ProblemFour();
		List<String> expected =Arrays.asList("ruhsikesh","abhi","sunita","malvadkar");
		assertEquals(expected, problemFour.getNamesWithLengthGretarThenThree(names));
	}
	
	@Test
	void getNamesWithLengthGretarThenThreeTwo() {
		List<String> names =Arrays.asList();
		ProblemFour problemFour = new ProblemFour();
		List<String> expected =Arrays.asList();
		assertEquals(expected, problemFour.getNamesWithLengthGretarThenThree(names));
	}
	@Test
	void getNamesWithLengthGretarThenThreeThree() {
		List<String> names =Arrays.asList("ab");
		ProblemFour problemFour = new ProblemFour();
		List<String> expected =Arrays.asList();
		assertEquals(expected, problemFour.getNamesWithLengthGretarThenThree(names));
	}
	
	@Test
	void getNamesWithLengthGretarThenThreeFour() {
		List<String> names =null;
		ProblemFour problemFour = new ProblemFour();
		assertThrows(IllegalArgumentException.class, ()->problemFour.getNamesWithLengthGretarThenThree(names));
	}
	
	
	

}
