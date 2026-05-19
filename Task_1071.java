public class Task_1071 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        int sl1 = str1.length(), sl2 = str2.length();
        int r = 1;
        while (r != 0) {
            r = sl1 % sl2;
            sl1 = sl2;
            sl2 = r;
        }
        return str2.substring(0, sl1);
    }
}
