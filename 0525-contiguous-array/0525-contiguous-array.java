class Solution {
    public int findMaxLength(int[] nums) {
        // HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        // put (0 , -1)
        map.put(0,-1);
        int sum = 0;
        int maxLength = 0;
        // calculate prefix sum

        for (int i = 0; i< nums.length;i++){
            // Sum already exists
            if(nums[i] == 0){
                sum --;
            }else{
                sum ++;
            }
            // Yes calculate length
             // No store index
            if(map.containsKey(sum)){
                int length = i - map.get(sum);
                maxLength = Math.max(maxLength, length);
               
            }else{
                map.put(sum , i);
            }
        }
        return maxLength;
    }
}