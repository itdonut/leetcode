package org.example.tasks;

import java.util.HashMap;
import java.util.Map;

public class Task_13 {
	private Map<String, Integer> values  = new HashMap<String, Integer>() {{
		put("I",  1);
	    put("IV", 4);
	    put("V",  5);
	    put("IX", 9);
	    put("X",  10);
	    put("XL", 40);
	    put("L",  50);
	    put("XC", 90);
	    put("C",  100);
	    put("CD", 400);
	    put("D",  500);
	    put("CM", 900);
	    put("M",  1000);
	}};

    public int romanToInt(String s) {
        Integer num = 0;
        for (int i = 0; i < s.length(); i++) {
            String currentVal = String.valueOf(s.charAt(i));
            if (i + 1 != s.length()) {
                String nextChar = String.valueOf(s.charAt(i + 1));
                if (this.values.containsKey(currentVal + nextChar)) {
                    num += this.values.get(currentVal + nextChar);
                    i++;
                    continue;
                }
            }
            num += this.values.get(currentVal);
        }
        return num;
    }
}
