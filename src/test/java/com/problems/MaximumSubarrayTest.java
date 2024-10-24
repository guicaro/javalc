package com.problems;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


public class MaximumSubarrayTest {

    @Test
    public void shouldReturnSix() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = solution.maximumSubarray(nums);
        assertEquals(6, result);
    }

    @Test
    public void shouldReturn23() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {5,4,-1,7,8};
        int result = solution.maximumSubarray(nums);
        assertEquals(23, result);
    }

    @Test
    public void shouldReturn2() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {2};
        int result = solution.maximumSubarray(nums);
        assertEquals(2, result);
    }
    
}
