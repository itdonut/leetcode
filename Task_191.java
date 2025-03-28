package org.example.tasks;

public class Task_191 {
    public int hammingWeight(int n) {
        return Integer.toBinaryString(n).length() - Integer.toBinaryString(n).replace("1", "").length();
    }
}
