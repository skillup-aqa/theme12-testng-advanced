package ua.skillup.part4;

public class IntArrayOperations {
    public static int[] fillWithNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 1000);
        }
        return array;
    }

    public static int max(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    public static int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static int avg(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return sum(array) / array.length;
    }

    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static int[] copy(int[] array) {
        int[] copied = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }

    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int[] removeDuplicates(int[] array) {
        int[] unique = new int[array.length];
        int index = 0;
        for (int j : array) {
            if (indexOf(unique, j) == -1) {
                unique[index++] = j;
            }
        }
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;

    }

    public static int[] sort(int[] array) {
        int[] sorted = copy(array);
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            merged[array1.length + i] = array2[i];
        }
        return merged;
    }

    public static boolean isSorted(int[] array) {
        if (array.length < 2) {
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static int binarySearch(int[] array, int value) {
        if (!isSorted(array)) {
            throw new IllegalArgumentException("Array should be sorted in ascending order");
        }

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
