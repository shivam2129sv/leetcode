class Solution {
    public int mirrorDistance(int n) {
        int reverse = 0;
        int num = n;
        int count = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10 + digit ;
            n = n/10;
            count++;
        }
        int r = Math.abs(num - reverse);
        return r;
    }
}