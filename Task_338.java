public class Task_338 {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            while (tmp > 0) {
                tmp = tmp & (tmp - 1);
                count++;
            }
            res[i] = count;
            count = 0;
        }
        return res;
    }
}
