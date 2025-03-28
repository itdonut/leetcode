package org.example.tasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task_26 {
    public int removeDuplicates(int[] nums) {
        Set<Integer> result = new LinkedHashSet<>();
        for (int num : nums) {
            result.add(num);
            System.out.println(result);
        }

        int i = 0;
        for (Integer num : result) {
            nums[i] = num;
            i++;
        }
        return result.size();
    }
}
