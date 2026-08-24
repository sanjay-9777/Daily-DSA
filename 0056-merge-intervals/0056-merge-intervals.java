class Solution {
    public int[][] merge(int[][] a) {
        // sort 
        List<int[]> res = new ArrayList<>();
        int n = a.length;
        Arrays.sort(a, (x, y) -> x[0] - y[0]);
        
        // Take the first interval
        int start1 = a[0] [0];
        int end1 = a[0] [1];

        //Start checking from the second interval
        for (int i = 1; i < n; i++){
            int start2 = a[i] [0];
            int end2 = a[i] [1];

            if(end1 >= start2){
                start1 = start1;
                end1 = Math.max(end1 , end2); 
                continue;          
            }
            // push
            res.add(new int[]{start1 , end1});
            start1 = start2;
            end1 = end2;


        }
       res.add(new int[]{start1 , end1});
       return res.toArray(new int[res.size()][]);
    }
}