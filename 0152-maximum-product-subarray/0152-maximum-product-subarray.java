class Solution {
    public int maxProduct(int[] nums) {
        int maxEnd = nums[0];
        int minEnd = nums[0];
        int ans =  nums[0];

        for (int i = 1; i < nums.length; i ++){
            int current = nums[i];
            int v1 = maxEnd * current;
            int v2 = minEnd * current;

            maxEnd = Math.max(current, Math.max(v1, v2));
            minEnd = Math.min(current, Math.min(v1, v2));

            ans = Math.max(ans, maxEnd);


        }
        return ans ;
    }
}