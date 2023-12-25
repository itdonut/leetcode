package org.example.tasks;

public class Task_202 {
	public boolean isHappy(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int result = 0;
        
        if (n <= 9 && n >= 2 && n != 7) return false;
        
        while(result != 1) {
        	if (result <= 9 && result >= 2 && result != 7) return false;
        	result = 0;
        	for (char val : arr) {
        		result += (int) Math.pow(Character.getNumericValue(val), 2);
        	}
        	arr = String.valueOf(result).toCharArray();
        }

        return true;

    }
}
