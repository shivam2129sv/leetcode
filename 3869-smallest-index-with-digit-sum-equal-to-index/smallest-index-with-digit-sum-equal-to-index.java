class Solution {
    public int smallestIndex(int[] arr) {
        int n = arr.length;
        int num = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            num = arr[i];
            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
}