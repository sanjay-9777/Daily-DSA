class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0 , sum = 0;
        int min_Len = Integer.MAX_VALUE;
        for (int right = 0; right < n; right++){
            sum += nums[right];
            //  shrink window while sum >= target
            while(sum >= target){
                min_Len = Math.min(min_Len, right - left +1);
                sum-= nums[left];
                left ++;
            }
        }
         return (min_Len == Integer.MAX_VALUE) ? 0 : min_Len;
    }
}