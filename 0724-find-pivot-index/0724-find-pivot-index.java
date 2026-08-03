class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        // total sum
        int sum = Arrays.stream(nums).sum();

        // chaek every index
        for(int i = 0; i < nums.length; i++){
            
            int right = sum - nums[i] - left;
            // compare right ot left same or not
            if(left == right){
                // cheak prefix and suffix are the same or not 
                return i;       //return index

            }
            left += nums[i];
        }
        return -1;
    }
}