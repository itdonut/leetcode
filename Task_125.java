package org.example.tasks;

public class Task_125 {
    public boolean isPalindrome(String s) {
        StringBuilder text = new StringBuilder();

        for (char ch : s.toLowerCase().toCharArray()) {
            int code = (int) ch;
            if ((code >= 48 && code <= 57) || (code >= 97 && code <= 122)) {
                text.append(ch);
            }
        }

        int len = text.length();
        for (int i = 0; i < len / 2; i++) {
            if (text.charAt(i) != text.charAt(len - i - 1))
                return false;
        }
        return true;
    }
}
