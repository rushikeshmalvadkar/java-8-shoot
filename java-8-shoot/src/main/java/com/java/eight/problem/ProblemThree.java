package com.java.eight.problem;

import java.util.Arrays;
import java.util.List;

public class ProblemThree {
 
	 /**
	  * Java 8 program to find the Maximum number of a Stream
	  * 
	  */
  public int getMaxValue(List<Integer> numbers) {
	  if(numbers==null) {
		  throw new IllegalArgumentException();
	  }
	  Integer maxValue = numbers.stream().max((Integer o1,Integer o2)->o1.compareTo(o2)).get();
	  return maxValue;
  }
}
