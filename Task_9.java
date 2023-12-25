package org.example.tasks;

public class Task_9 {
    public boolean isPalindrome(int x) {
        String intAsStr = String.valueOf(x);
        for (int i = 0, j = String.valueOf(x).length() - 1; i < j; i++, j--) {
            if (intAsStr.charAt(i) != intAsStr.charAt(j)) return false;
        }
        return true;
    }
}
