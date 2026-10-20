class Solution {
    public int[] transformArray(int[] arr) {
         int n = arr.length;
         int even = 0;
         int count = 0;
         for(int i = 0; i<n; i++){
            if(arr[i]%2==0){
                count++;
            }
         }
         for(int i = 0; i<n; i++){
            if(count>0){
                arr[i] = 0;
                count--;
            }
            else{
                arr[i]=1;
            }
         }
         return arr;
    }
}