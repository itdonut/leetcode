package org.example.tasks;

import java.util.Arrays;

public class Task_189 {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1) return;

        int[] tempArr = new int[nums.length];

        if (nums.length < k) {
            for (int i = 0; i < k; i++) {
                System.arraycopy(nums, nums.length - 1, tempArr, 0, 1);
                System.arraycopy(nums, 0, tempArr, 1, nums.length - 1);
                System.arraycopy(tempArr, 0, nums, 0, tempArr.length);
            }
        }

        if (nums.length >= k) {
            System.arraycopy(nums, nums.length - k, tempArr, 0, k);
            System.arraycopy(nums, 0, tempArr, k, nums.length - k);
            System.arraycopy(tempArr, 0, nums, 0, tempArr.length);
        }
    }
}
