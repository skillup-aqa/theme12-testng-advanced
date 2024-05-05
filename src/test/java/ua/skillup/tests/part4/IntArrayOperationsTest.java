package ua.skillup.tests.part4;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ua.skillup.part4.IntArrayOperations;

import static org.testng.Assert.*;

public class IntArrayOperationsTest {
    private int[] array;

    @BeforeMethod(onlyForGroups = "default")
    public void defaultSetUp() {
        array = new int[]{1, 2, 3, 4, 5};
    }

    @BeforeMethod(onlyForGroups = "empty")
    public void emptyArraySetup() {
        array = new int[0];
    }

    @Test
    public void testFillWithNumbers() {
        int[] array1 = IntArrayOperations.fillWithNumbers(new int[100]);
        int[] array2 = IntArrayOperations.fillWithNumbers(new int[100]);
        assertNotEquals(array1, array2);
    }

    @Test(groups = "default")
    public void testMax() {
        assertEquals(IntArrayOperations.max(array), 5);
    }

    @Test(groups = "empty")
    public void testMaxForEmptyArray() {
        assertEquals(IntArrayOperations.max(array), 0);
    }

    @Test(groups = "default")
    public void testMin() {
        assertEquals(IntArrayOperations.min(array), 1);
    }

    @Test(groups = "empty")
    public void testMinForEmptyArray() {
        assertEquals(IntArrayOperations.min(array), 0);
    }

    @Test(groups = "default")
    public void testSum() {
        assertEquals(IntArrayOperations.sum(array), 15);
    }

    @Test(groups = "empty")
    public void testSumForEmptyArray() {
        assertEquals(IntArrayOperations.sum(array), 0);
    }

    @Test(groups = "default")
    public void testAverage() {
        assertEquals(IntArrayOperations.avg(array), 3);
    }

    @Test(groups = "empty")
    public void testAverageForEmptyArray() {
        assertEquals(IntArrayOperations.avg(array), 0);
    }

    @Test(groups = "default")
    public void testReverse() {
        int[] reversed = IntArrayOperations.reverse(array);
        assertEquals(reversed, new int[]{5, 4, 3, 2, 1});
    }

    @Test(groups = "default")
    public void testCopy() {
        int[] copied = IntArrayOperations.copy(array);
        assertEquals(copied, array);
    }

    @Test(groups = "default")
    public void testIndexOf() {
        assertEquals(IntArrayOperations.indexOf(array, 3), 2);
    }

    @Test(groups = "default")
    public void testIndexOfNotFound() {
        assertEquals(IntArrayOperations.indexOf(array, 6), -1);
    }

    @Test
    public void testRemoveDuplicates() {
        int[] array1 = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = IntArrayOperations.removeDuplicates(array1);
        assertEquals(result, expected);
    }

    @Test(groups = "empty")
    public void testRemoveDuplicatesForEmptyArray() {
        int[] expected = {};
        int[] result = IntArrayOperations.removeDuplicates(array);
        assertEquals(result, expected);
    }

    @Test
    public void testSort() {
        int[] array1 = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = IntArrayOperations.sort(array1);
        assertEquals(result, expected);
    }

    @Test(groups = "empty")
    public void testSortForEmptyArray() {
        int[] expected = {};
        int[] result = IntArrayOperations.sort(array);
        assertEquals(result, expected);
    }

    @Test
    public void testMerge() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] result = IntArrayOperations.merge(array1, array2);
        assertEquals(result, expected);
    }

    @Test
    public void testMergeForEmptyArray() {
        int[] array1 = {};
        int[] array2 = {};
        int[] expected = {};
        int[] result = IntArrayOperations.merge(array1, array2);
        assertEquals(result, expected);
    }

    @Test(groups = "default")
    public void testBinarySearch() {
        assertEquals(IntArrayOperations.binarySearch(array, 3), 2);
    }

    @Test(groups = "default")
    public void testBinarySearchNotFound() {
        assertEquals(IntArrayOperations.binarySearch(array, 6), -1);
    }

    @Test(groups = "empty")
    public void testBinarySearchForEmptyArray() {
        assertEquals(IntArrayOperations.binarySearch(array, 6), -1);
    }

    @Test
    public void testBinarySearchForNotSortedElement() {
        int[] array1 = {3, 2, 1};
        assertThrows(IllegalArgumentException.class, () -> IntArrayOperations.binarySearch(array1, 1));
    }
}
