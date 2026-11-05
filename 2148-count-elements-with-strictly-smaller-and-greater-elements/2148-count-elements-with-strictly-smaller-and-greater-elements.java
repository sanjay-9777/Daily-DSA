class Solution {
    public int countElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find minimum and maximum
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int count = 0;

        // Count elements between min and max
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > min && nums[i] < max) {
                count++;
            }
        }

        return count;
    }
}