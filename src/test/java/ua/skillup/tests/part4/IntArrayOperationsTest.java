package ua.skillup.tests.part4;

import org.testng.annotations.Test;
import ua.skillup.part4.IntArrayOperations;

import java.util.Arrays;

import static org.testng.Assert.*;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class IntArrayOperationsTest {
    @Test
    public void testFillWithNumbers() {
        int[] array1 = IntArrayOperations.fillWithNumbers(new int[100]);
        int[] array2 = IntArrayOperations.fillWithNumbers(new int[100]);
        assertNotEquals(array1, array2);
    }

    @Test
    public void testMaxPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        assertEquals(IntArrayOperations.max(array1), 56);
    }

    @Test
    public void testMinPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        assertEquals(IntArrayOperations.min(array1), 1);
    }

    @Test
    public void testSumPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        assertEquals(IntArrayOperations.sum(array1), 73);
    }

    @Test
    public void testAvgPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        assertEquals(IntArrayOperations.avg(array1), 12);
    }

    @Test
    public void testReversePositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        int[] arrayReversed = {7, 56, 4, 3, 2, 1};
        assertTrue(Arrays.equals(IntArrayOperations.reverse(array1), arrayReversed));
    }

    @Test
    public void testCopyPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        int[] array2 = {1, 2, 3, 4, 56, 7};
        int[] copiedArray = IntArrayOperations.copy(array1);
        assertTrue((Arrays.equals(copiedArray, array2)));
    }

    @Test
    public void testIndexOfPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        assertEquals(IntArrayOperations.indexOf(array1, 56), 4);
    }

    @Test
    public void testRemoveDuplicatesPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7, 4, 8, 3};
        int[] array2 = {1, 2, 3, 4, 56, 7, 8};
        assertTrue(Arrays.equals(IntArrayOperations.removeDuplicates(array1), array2));
    }

    @Test
    public void testSortAscending() {
        int[] array1 = {3, 5, 4, 2, 1};
        int[] array2 = {1, 2, 3, 4, 5};
        assertArrayEquals(IntArrayOperations.sort(array1), array2);
    }

    @Test
    public void testIsSortedAscending() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertTrue(IntArrayOperations.isSorted(array1));
    }

    @Test
    public void testMergePositive() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] merged = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        assertArrayEquals(IntArrayOperations.merge(array1, array2), merged);
    }

    @Test
    public void testBinarySearchAscendingPositive() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.binarySearch(array1, 4), 3);
    }

    @Test
    public void testMaxEmpty() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.max(array1), 0);
    }

    @Test
    public void testMinEmpty() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.min(array1), 0);
    }

    @Test
    public void testAvgEmpty() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.avg(array1), 0);
    }

    @Test
    public void testIsSortedWithOneItem() {
        int[] array1 = {11};
        assertTrue(IntArrayOperations.isSorted(array1));
    }

    @Test
    public void testIsSortedFalse() {
        int[] array1 = {1, 5, 3};
        assertFalse(IntArrayOperations.isSorted(array1));
    }

    @Test
    public void testBinarySearchAbsentValue() {
        int[] array1 = {1, 5, 7, 9};
        assertEquals(IntArrayOperations.binarySearch(array1, 3), -1);
    }

    @Test
    public void testIndexOfAbsentValue() {
        int[] array1 = {1, 5, 7, 9};
        assertEquals(IntArrayOperations.indexOf(array1, 15), -1);
    }
}
