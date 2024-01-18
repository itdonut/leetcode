package org.example.tasks;

import java.util.Arrays;

public class Task_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[n + m];
        int curResIdx = 0;
        int curIdx1 = 0;
        int curIdx2 = 0;
        for (int i = 0; i < n + m; i++) {
            if (curIdx1 >= m) {
                res[curResIdx] = nums2[curIdx2];
                curIdx2++;
                curResIdx++;
                continue;
            }

            if (curIdx2 >= n) {
                res[curResIdx] = nums1[curIdx1];
                curIdx1++;
                curResIdx++;
                continue;
            }

            if (nums1[curIdx1] < nums2[curIdx2]) {
                res[curResIdx] = nums1[curIdx1];
                curIdx1++;
            }
            else {
                res[curResIdx] = nums2[curIdx2];
                curIdx2++;
            }
            curResIdx++;
        }

        if (n + m >= 0)
            System.arraycopy(res, 0, nums1, 0, n + m);

        System.out.println(Arrays.toString(nums1));
    }
}
