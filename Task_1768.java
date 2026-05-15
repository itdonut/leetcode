public class Task_1768 {
    public String mergeAlternately(String word1, String word2) {
        int shorter = Math.min(word1.length(), word2.length());
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < shorter; i++) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }
        if (word1.length() > word2.length())
            res.append(word1.substring(shorter));
        if (word1.length() < word2.length())
            res.append(word2.substring(shorter));
        return res.toString();
    }
}
