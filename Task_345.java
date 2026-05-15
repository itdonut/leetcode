import java.util.List;

public class Task_345 {
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' || ch == 'e' || ch == 'E';
    }
    
    public String reverseVowels(String s) {
        if (s.length() == 1)
            return s;

        char[] ca = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (isVowel(ca[i]) && !isVowel(ca[j])) {
                j--;
                continue;
            }
            if (!isVowel(ca[i]) && isVowel(ca[j])) {
                i++;
                continue;
            }
            if (isVowel(ca[i]) && isVowel(ca[j])) {
                char temp = ca[i];
                ca[i] = ca[j];
                ca[j] = temp;
            }
            i++;
            j--;
        }
        return new String(ca);
    }
}
