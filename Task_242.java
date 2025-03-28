package org.example.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Task_242 {
    public boolean isAnagram(String s, String t) {
        HashSet<Character> setS = new HashSet<>();
        HashSet<Character> setT = new HashSet<>();

        for (char ch : s.toCharArray())
            setS.add(ch);

        for (char ch : t.toCharArray())
            setT.add(ch);

        if (setS.size() != setT.size())
            return false;

        for (char ch : setS) {
            if (!setT.contains(ch))
                return false;

            if ((int) s.chars().filter(c -> c == ch).count() != (int) t.chars().filter(c -> c == ch).count())
                return false;
        }

        return true;
    }
}
