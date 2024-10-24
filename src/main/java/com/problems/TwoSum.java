package com.problems;
/*
Problem Statement: Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to target.

Constraints:

Each input has exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: nums[0] + nums[1] == 2 + 7 == 9, so we return [0, 1]

 */

 import java.util.Map;
 import java.util.HashMap;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
	  // Solution goes here
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];

	if (map.containsKey(complement)) {
		return new int[] {map.get(complement), i};
	}
	
	map.put(nums[i], i);
    }

    throw new IllegalArgumentException("There is no solution");
  }
}
