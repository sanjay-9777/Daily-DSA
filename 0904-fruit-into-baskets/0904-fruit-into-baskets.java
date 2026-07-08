import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        // map to store: fruit type -> count of that fruit in current window
        HashMap<Integer, Integer> basket = new HashMap<>();
        
        int left = 0;           // left edge of our window
        int maxLength = 0;      // best answer so far
        
        // right pointer walks through every tree exactly once
        for (int right = 0; right < fruits.length; right++) {
            
            // Step A: add current fruit into our basket (map)
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            
            // Step B: if we now have more than 2 fruit types, shrink from left
            while (basket.size() > 2) {
                int leftFruit = fruits[left];
                
                // remove one count of the left fruit
                basket.put(leftFruit, basket.get(leftFruit) - 1);
                
                // if that fruit type count becomes 0, remove it completely from map
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }
                
                // move left pointer forward (shrinking window)
                left++;
            }
            
            // Step C: window [left, right] is now guaranteed valid (≤ 2 types)
            // update maxLength if this window is bigger than what we've seen
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}