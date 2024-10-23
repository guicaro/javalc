package com.problems;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwoSumTest {
  
  @Test
  public void shouldEqualArrays() {
	  TwoSum solution = new TwoSum();
	  int[] nums = {2, 7, 11, 15};
	  int target = 9;
	  int[] result = solution.twoSum(nums, target);
	  assertArrayEquals(new int[]{1,2}, result);
  }
}

