package org.example.tasks;

public class Task_3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;

        for(int i = 0; i < n; i++) {
            boolean[] visitedChars = new boolean[256];

            for(int j = i; j < n; j++) {
                if (visitedChars[s.charAt(j)])
                    break;
                else {
                    res = Math.max(res, j - i + 1);
                    visitedChars[s.charAt(j)] = true;
                }
            }
            visitedChars[s.charAt(i)] = false;
        }

        return res;
    }
}
