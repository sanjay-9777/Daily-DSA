class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        // first element
        arr1.add(nums[0]);
        // second element
        arr2.add(nums[1]);

        // Remaining elements
        for(int i = 2; i < nums.length;i++){        //i = 2 bcz we already took arr1 and arr2
        // compare last elements
        if(arr1.get (arr1.size()-1) > arr2.get(arr2.size() - 1)){
            arr1.add(nums[i]);
        }else{
            arr2.add(nums[i]);
        }

        }
        // combine arr1 + arr2
        List<Integer> result = new ArrayList<>(arr1);
        result.addAll(arr2);

        // convert List integer to int 
        return result.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();


    }
}