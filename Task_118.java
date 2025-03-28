package org.example.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(0, 1);

            if (i > 1) {
                for (int j = 0; j < result.get(i - 1).size() - 1; j++) {
                    currentRow.add(j + 1, result.get(i - 1).get(j) + result.get(i - 1).get(j + 1));
                }
            }

            if (i > 0) currentRow.add(currentRow.size(), 1);

            result.add(currentRow);
            System.out.println(currentRow);
        }

        return result;
    }
}
