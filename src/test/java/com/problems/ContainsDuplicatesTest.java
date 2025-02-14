package com.problems;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class ContainsDuplicatesTest {

    @Test
    public void testContainsDuplicatesWithDuplicates() {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] nums = {1, 2, 3, 1};
        assertTrue(cd.containsDuplicates(nums));
    }

    @Test
    public void testContainsDuplicatesWithoutDuplicates() {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] nums = {1, 2, 3, 4};
        assertFalse(cd.containsDuplicates(nums));
    }

    @Test
    public void testContainsDuplicatesWithMultipleDuplicates() {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(cd.containsDuplicates(nums));
    }

    @Test
    public void testContainsDuplicatesWithEmptyArray() {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] nums = {};
        assertFalse(cd.containsDuplicates(nums));
    }

    @Test
    public void testContainsDuplicatesWithSingleElement() {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] nums = {1};
        assertFalse(cd.containsDuplicates(nums));
    }
}