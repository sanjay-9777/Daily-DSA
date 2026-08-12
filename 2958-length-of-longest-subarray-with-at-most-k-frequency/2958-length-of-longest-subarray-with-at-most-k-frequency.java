class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
           Map<Integer, Integer> freq = new HashMap<>();
           int left = 0;
           int maxLength = 0;
           for(int right = 0; right < nums.length; right ++){
            freq.put(nums[right], freq.getOrDefault(nums[right],0)+1);

            // if current window is invalid
            while(freq.get(nums[right]) > k){

                // remove left ele
                freq.put(nums[left],
                        freq.get(nums[left]) - 1);

                left++;
            }
            // Current window is valid
            int length = right - left + 1;

            maxLength = Math.max(maxLength, length);
           }
           return maxLength;
    }
}