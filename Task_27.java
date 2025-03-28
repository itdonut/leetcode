package org.example.tasks;

public class Task_27 {
    public int removeElement(int[] nums, int val) {
        int endIdx = nums.length - 1;
        int count = 0;
        for (int i = 0; i <= endIdx; i++) {
            if (nums[i] == val) {
                count++;
                int tmp = nums[i];
                nums[i] = nums[endIdx];
                nums[endIdx] = tmp;
                endIdx--;
                i--;
            }
        }
        return nums.length - count;
    }
}
