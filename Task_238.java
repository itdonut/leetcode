public class Task_238 {
    public int[] productExceptSelf(int[] nums) {
        int nl = nums.length;
        int[] result = new int[nl];

        int zeroPos = -1;
        int zerosCount = 0;
        int fullProduct = 1;

        for (int i = 0; i < nl; i++) {
            if (nums[i] == 0) {
                zeroPos = i;
                zerosCount++;
                continue;
            }
            fullProduct *= nums[i];
        }

        if (zerosCount > 1) {
            return result;
        }
        if (zerosCount == 1) {
            result[zeroPos] = fullProduct;
            return result;
        }

        for (int i = 0; i < nl; i++) {
            result[i] = fullProduct / nums[i];
        }

        return result;
    }
}
