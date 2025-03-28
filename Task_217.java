package org.example.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Task_217 {
    public boolean containsDuplicate(int[] nums) {
        return nums.length != Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new)).size();
    }
}
