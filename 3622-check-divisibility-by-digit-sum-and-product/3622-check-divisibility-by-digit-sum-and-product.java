// class Solution {
//     public boolean checkDivisibility(int n) {
//         String str = String.valueOf(n);

//         int sum = 0;
//         int product = 1;        //bcz something * 0 = 0

//         for(int i = 0; i < str.length(); i++){
//             int digit = str.charAt(i) -'0';     //charAt() gives us a character, not an integer . so '1' -> 1
//             sum = sum + digit;
//             product = product * digit;

//         }
//         return n % (sum + product)==0;


//     }
// }

class Solution {
    public boolean checkDivisibility(int n) {

        int original = n;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;

            sum += digit;
            product *= digit;

            n = n / 10;
        }

        return original % (sum + product) == 0;
    }
}