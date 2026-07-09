class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int [26];      //for frequency .. A=0 , B=1 , C=2 ...

        int left =0;
        int MaxFreq = 0;
        int res = 0;

        for (int right = 0; right< s.length(); right ++){
            char ch = s.charAt(right);
            freq[ch-'A']++;
            MaxFreq = Math.max(MaxFreq, freq[ch-'A']);
            while((right - left +1) - MaxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left ++;
            }
            res = Math.max(res, right - left +1);
        }
        return res;
    }
}