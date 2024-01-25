package org.example.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task_289 {
    public void gameOfLife(int[][] board) {
        List<Integer[]> cellsWhichNeedChanging = new ArrayList<>();
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (this.wantToBeChanged(board, i, j, m, n))
                    cellsWhichNeedChanging.add(new Integer[]{i, j});
            }
        }

        for (Integer[] coords : cellsWhichNeedChanging) {
            if (board[coords[0]][coords[1]] == 0) {
                board[coords[0]][coords[1]] = 1;
            } else {
                board[coords[0]][coords[1]] = 0;
            }
        }
    }

    private boolean wantToBeChanged(int[][] board, int row, int col, int m, int n) {
        int areaRowLeft = row == 0 ? row : row - 1;
        int areaRowRight = row == m - 1 ? row : row + 1;
        int areaColLeft = col== 0 ? col : col - 1;
        int areaColRight = col == n - 1 ? col : col + 1;

        int countLive = 0;

        for (int i = areaRowLeft; i <= areaRowRight; i++) {
            for (int j = areaColLeft; j <= areaColRight; j++) {
                if (board[i][j] == 1)
                    countLive++;
            }
        }

        // we sub 1 because it adds target cell to countLive when target = 1
        if (board[row][col] == 1 && (countLive - 1 > 3 || countLive - 1 < 2))
            return true;

        if (board[row][col] == 0 && countLive == 3)
            return true;

        return false;
    }
}
