public class Task_151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        int i = s.length() - 1;
        while (i >= 0) {
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            String ss = s.substring(j + 1, i + 1);
            if (!ss.isBlank()) {
                sb.append(ss);
                sb.append(" ");
            }
            i = j - 1;
            if (i < 0)
                break;
        }
        return sb.toString().trim();
    }
}
