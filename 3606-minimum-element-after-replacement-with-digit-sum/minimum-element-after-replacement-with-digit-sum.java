class Solution {
    public int minElement(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int a = arr[i];
            while (a > 0) {
                int b = a % 10;
                sum = sum + b;
                a = a / 10;
            }
            arr[i] = sum;
            min = Math.min(min, arr[i]);
        }
        return min;    
    }
}