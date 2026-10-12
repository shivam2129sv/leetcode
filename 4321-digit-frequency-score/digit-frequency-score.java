class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        while(n>0){
            int num = n%10;
            sum += num;
            n = n/10;
        }
        return sum;
    }
}