package org.example.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task_228 {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0)
            return new ArrayList<>();

        int left = 0;
        List<String> ranges = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1] - 1) {
                if (left == i)
                    ranges.add(String.valueOf(nums[left]));
                else {
                    ranges.add(nums[left] + "->" + nums[i]);
                }
                left = i + 1;
            }
        }

        if (left == nums.length - 1)
            ranges.add(String.valueOf(nums[left]));
        else {
            ranges.add(nums[left] + "->" + nums[nums.length - 1]);
        }

        return ranges;
    }
}
