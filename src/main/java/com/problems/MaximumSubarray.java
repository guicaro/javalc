package com.problems;

/*
Problem: Maximum Subarray (Kadane's Algorithm)
Problem Statement:
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum = 6.

Input: nums = [1]
Output: 1
Explanation: The array contains only one element, so it’s the maximum subarray itself.

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The entire array has the largest sum = 23.
 */

public class MaximumSubarray {
        // Run: O(n). Space: O(1)


    public int maximumSubarray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    
}
