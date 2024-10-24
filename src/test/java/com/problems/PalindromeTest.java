package com.problems;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
               
public class PalindromeTest {
    
    @Test
    public void shouldReturnTrue() {
        Palindrome solution = new Palindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(s);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalse() {
        Palindrome solution = new Palindrome();
        String s = "Howdy, I am not a palindrome";
        boolean result = solution.isPalindrome(s);
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnTrueWhenEmpty() {
        Palindrome solution = new Palindrome();
        String s = "";
        boolean result = solution.isPalindrome(s);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnTrueWhenNoAlphanumeric() {
        Palindrome solution = new Palindrome();
        String s = ",..,.";
        boolean result = solution.isPalindrome(s);
        assertEquals(true, result);
    }
    
}
