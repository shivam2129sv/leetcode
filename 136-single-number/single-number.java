class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        int x = 0;
        for(int i = 0; i<n; i++){
            x = x^arr[i];
        }
        return x;
    }
}