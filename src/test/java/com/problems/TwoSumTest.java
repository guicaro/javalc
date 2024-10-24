package com.problems;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TwoSumTest {
  
  @Test
  public void shouldReturnAnswerWhenOneSolution() {
	  TwoSum solution = new TwoSum();
	  int[] nums = {2, 7, 11, 15};
	  int target = 9;
	  int[] result = solution.twoSum(nums, target);
	  assertArrayEquals(new int[]{0,1}, result);
  }

  @Test
  public void shouldReturnException() {
	TwoSum solution = new TwoSum();
	int[] nums = {1, 3, 5};
	int target = 99;
	IllegalArgumentException e = assertThrows(
		IllegalArgumentException.class,
		() -> solution.twoSum(nums, target)
	);

	assertEquals("There is no solution", e.getMessage()); 
  }
}

