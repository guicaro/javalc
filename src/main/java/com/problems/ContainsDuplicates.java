package com.problems;
/* 
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

 */

 import java.util.Set;
 import java.util.HashSet;

 public class ContainsDuplicates {
    public boolean containsDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for (int num : nums) {
            if (s.contains(num)) {
                return true;
            }
            s.add(num);
        }
        return false;
    }
 }