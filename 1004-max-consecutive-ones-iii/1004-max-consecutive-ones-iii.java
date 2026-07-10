class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int ZeroCount = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right ++){
            if(nums[right]==0){
                ZeroCount ++;   //Sirf zero ko dekhna hai 
            }
            while(ZeroCount  > k){
                if(nums[left]==0){
                    ZeroCount--;
                }
                left ++;
            }
            ans = Math.max(ans, right - left +1);
        }
        return ans;
    }
}