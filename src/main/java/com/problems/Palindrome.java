package com.problems;

/*
Problem Statement:
Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Constraints:

An empty string is considered a valid palindrome.
Consider only alphanumeric characters (ignore spaces, punctuation, etc.).
Example
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: After ignoring non-alphanumeric characters and converting to lowercase, s becomes "amanaplanacanalpanama", which is a palindrome.

Input: s = "race a car"
Output: false
Explanation: After cleaning, s becomes "raceacar", which is not a palindrome.
 */

public class Palindrome {
    public boolean isPalindrome(String s) {

        // 1. Pointer in left and right of 's'
        // 2. While ignoring punctuation and spaces and case, check if left and right match
        // 2.1 If not match -> return false
        // 2.2 Increase left and decrease right
        // 3. return true  

        // Run: O(n). Space: O(1)

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
