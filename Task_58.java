package org.example.tasks;

import java.util.Arrays;
import java.util.Objects;

public class Task_58 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!Objects.equals(arr[i], " "))
                return arr[i].length();
        }

        return 0;
    }
}
