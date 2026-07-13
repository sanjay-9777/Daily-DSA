class Solution {
    public String minWindow(String s, String t) {
        // If either string is empty, no valid window exists
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
    // Frequency array to store how many times each character of t is needed
        int[] freq = new int[128];
    
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0;
        int right = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
// Current character entering the window
            char r = s.charAt(right);
// If this character is still needed, decrease required count
            if (freq[r] > 0) {
                required--;
            }

            freq[r]--;
            right++;

            while (required == 0) {

                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char l = s.charAt(left);

                freq[l]++;

                if (freq[l] > 0) {
                    required++;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}