class Solution {
    public int minOperations(int[] arr, int k) {
        int sum = 0;
        for(int nums : arr){
            sum = sum + nums;
        }
        return sum%k;
    }
}