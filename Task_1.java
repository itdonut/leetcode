package org.example.tasks;

public class Task_1 {
    public int[] twoSum(int[] nums, int target) {
        int j = 1, i = 0;

        while (i < nums.length - 1) {
            if (nums[i] + nums[j] == target) {
                return new int[] {i, j};
            }
            if (j == nums.length - 1) {
                i++;
                j = i + 1;
            } else j++;
        }
        return new int[] {i, j};
    }
}
