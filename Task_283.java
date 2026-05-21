public class Task_283 {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;

        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }

        if (left == 0) return;
        int zerosCount = nums.length - left;
        for (int i = nums.length - 1; zerosCount > 0; i--, zerosCount--)
            nums[i] = 0;

        for (int i : nums) System.out.println(i);
    }
}
