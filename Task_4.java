package tasks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int[] mergedArray = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
//        mergedArray = Arrays.stream(mergedArray).sorted().toArray();
        int[] mergedArray = mergeSortedArrays(nums1, nums2);

        int ml = mergedArray.length;

        if (ml % 2 == 0) {
            int midLeft = mergedArray[ml / 2 - 1];
            int midRight = mergedArray[ml / 2];
            return (double) (midLeft + midRight) / 2;
        } else {
            return mergedArray[(ml - 1) / 2];
        }
    }

    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] mergedArray = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge process
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements
        while (i < n) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < m) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}
