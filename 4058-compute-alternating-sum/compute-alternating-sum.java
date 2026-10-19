class Solution {
    public int alternatingSum(int[] arr) {
        int n = arr.length;
        int even = 0;
        int odd = 0;
        for(int i = 0; i<n; i++){
            if(i%2==0){
                even = even + arr[i];
            }
            else{
                odd = odd - arr[i];
            }
        }
        return even + odd;
    }
}