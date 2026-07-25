class Solution {
    public int maximumSum(int[] arr) {

        int noDelete = arr[0];
        int oneDelete = 0;

        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int newOneDelete = Math.max(
                oneDelete + arr[i],
                noDelete
            );

            int newNoDelete = Math.max(
                arr[i],
                noDelete + arr[i]
            );

            oneDelete = newOneDelete;
            noDelete = newNoDelete;

            answer = Math.max(answer,
                    Math.max(noDelete, oneDelete));
        }

        return answer;
    }
}