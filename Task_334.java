public class Task_334 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE, third = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < first) {
                first = nums[i];
                continue;
            }
            if (nums[i] > first && nums[i] < second) {
                second = nums[i];
                continue;
            }
            if (nums[i] > second && nums[i] < third) {
                return true;
            }
        }
        return false;
    }
}
