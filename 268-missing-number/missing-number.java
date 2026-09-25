class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int x = 0;
        int xor1 = 0;
        int xor2 = 0;
        int XOR = 0;
        for(int i = 0; i<n; i++){
            xor1 = xor1^arr[i];
        }
        
        for(int i = 0; i<n+1; i++){
            xor2 = xor2^x ;
            x++;
        }
        XOR = xor1^xor2;
        return XOR;
        
    }
}