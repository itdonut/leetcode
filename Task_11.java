package org.example.tasks;

public class Task_11 {
    public int maxArea(int[] height) {
        int currLeftLineIdx = 0;
        int currRightLineIdx = height.length - 1;
        int maxArea = 0;

        while (currLeftLineIdx < currRightLineIdx) {
            int currentArea = Math.min(
                    height[currLeftLineIdx], height[currRightLineIdx]
            ) * (currRightLineIdx - currLeftLineIdx);

            maxArea = Math.max(maxArea, currentArea);

            if (height[currLeftLineIdx] < height[currRightLineIdx]) {
                currLeftLineIdx++;
            } else {
                currRightLineIdx--;
            }
        }
        System.gc();
        return maxArea;
    }
}
