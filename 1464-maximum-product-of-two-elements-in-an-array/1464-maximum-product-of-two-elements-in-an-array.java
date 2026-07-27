// class Solution {
//     public int maxProduct(int[] nums) {
//         int ans = 0;
//         for(int i = 0; i< nums.length; i++){
//             for(int j = i+1; j < nums.length; j++){
//                 int product = (nums[i] - 1) * (nums[j] - 1);

//                 ans = Math.max(ans, product);
//             }

//         }
        
//         return ans;
//     }
// }


// OPTIMAL

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}