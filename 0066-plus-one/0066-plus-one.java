class Solution {
    public int[] plusOne(int[] digits) {
        // start form last 
        for(int i = digits.length - 1; i >= 0; i--){

            // If digit is less than 9,
            // just add 1 and return
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }

        // If we reach here, all digits were 9
        // Example: [9,9,9] -> [1,0,0,0]
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}