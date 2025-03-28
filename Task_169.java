package org.example.tasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task_169 {
    public int majorityElement(int[] nums) {
        Set<Integer> result = new LinkedHashSet<>();
        for (int num : nums) {
            result.add(num);
        }

        for (int elem : result) {
            if (this.count(nums, elem) > nums.length / 2)
                return elem;
        }

        return -1;
    }

    private int count(int[] arr, int target) {
        int count = 0;
        for (int j : arr) {
            if (target == j)
                count++;
        }
        return count;
    }
}
