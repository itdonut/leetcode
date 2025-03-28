package org.example.tasks;

public class Task_48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // transposing the matrix
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reversing the rows
        for(int i = 0; i < n; i++)
        {
            int low = 0, high = n - 1;
            while(low < high)
            {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }

        for (int[] row : matrix) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
