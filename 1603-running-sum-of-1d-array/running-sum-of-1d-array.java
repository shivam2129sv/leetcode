class Solution {
    public int[] runningSum(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int a = arr[i];
            arr[i]= arr[i]+sum;
            sum = sum + a;
        }
        return arr;
    }
}