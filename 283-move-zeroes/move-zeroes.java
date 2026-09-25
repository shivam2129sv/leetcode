class Solution {
    public void moveZeroes(int[] arr) {
        int low = 0;
        int high = 0;

        while (high < arr.length) {
            if (arr[low] == 0) {
                while (high < arr.length && arr[high] == 0) {
                    high++;
                }
                if (high == arr.length) {
                    break;
                }
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high++;

            } else {
                low++;
                high++;
            }
        }
    }
}