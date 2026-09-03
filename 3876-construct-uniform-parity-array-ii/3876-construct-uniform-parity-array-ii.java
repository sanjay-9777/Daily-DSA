class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;

        // find the smallest odd number
        for(int num : nums1){
            if(num % 2 == 1){
                minOdd = Math.min(minOdd, num);
            }
            
        }
        // No odd number means all are already even
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }
        // Cheak every even number
        for(int num : nums1){
                if(num % 2 == 0 && num < minOdd){
                    return false;
                }
            }
            return true;
    }
}