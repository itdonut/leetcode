package org.example.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task_73 {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRows.contains(i))
                    matrix[i][j] = 0;
                if (zeroCols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int[] row: matrix) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
