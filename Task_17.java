package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_17 {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        if (digits.isEmpty())
            return combinations;

        Map<String, List<String>> kb = new HashMap<>();
        kb.put("2", List.of("a", "b", "c"));
        kb.put("3", List.of("d", "e", "f"));
        kb.put("4", List.of("g", "h", "i"));
        kb.put("5", List.of("j", "k", "l"));
        kb.put("6", List.of("m", "n", "o"));
        kb.put("7", List.of("p", "q", "r", "s"));
        kb.put("8", List.of("t", "u", "v"));
        kb.put("9", List.of("w", "x", "y", "z"));

        for (String letter1 : kb.get(String.valueOf(digits.charAt(0)))) {
            StringBuilder s = new StringBuilder(letter1);
            if (digits.length() == 1) {
                combinations.add(s.toString());
                continue;
            }
            for (String letter2 : kb.get(String.valueOf(digits.charAt(1)))) {
                if (s.length() >= 2)
                    s.delete(1, s.length());
                if (digits.length() == 2) {
                    combinations.add(s + letter2);
                    continue;
                }
                s.append(letter2);
                for (String letter3 : kb.get(String.valueOf(digits.charAt(2)))) {
                    if (s.length() >= 3)
                        s.delete(2, s.length());
                    if (digits.length() == 3) {
                        combinations.add(s + letter3);
                        continue;
                    }
                    s.append(letter3);
                    for (String letter4 : kb.get(String.valueOf(digits.charAt(3)))) {
                        if (s.length() >= 4)
                            s.delete(3, s.length());
                        if (digits.length() == 4) {
                            combinations.add(s + letter4);
                        }
                    }
                }
            }
        }

        return combinations;
    }
}
