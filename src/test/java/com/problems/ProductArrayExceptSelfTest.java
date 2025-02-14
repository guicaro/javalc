
package com.problems;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ProductArrayExceptSelfTest {

    @Test
    public void testProductExample1() {
        ProductArrayExceptSelf solution = new ProductArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] result = solution.product(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testProductExample2() {
        ProductArrayExceptSelf solution = new ProductArrayExceptSelf();
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        int[] result = solution.product(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testProductSingleElement() {
        ProductArrayExceptSelf solution = new ProductArrayExceptSelf();
        int[] nums = {5};
        int[] expected = {1};
        int[] result = solution.product(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testProductAllZeros() {
        ProductArrayExceptSelf solution = new ProductArrayExceptSelf();
        int[] nums = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        int[] result = solution.product(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testProductMixedNumbers() {
        ProductArrayExceptSelf solution = new ProductArrayExceptSelf();
        int[] nums = {2, 3, 4, 5};
        int[] expected = {60, 40, 30, 24};
        int[] result = solution.product(nums);
        assertArrayEquals(expected, result);
    }
}