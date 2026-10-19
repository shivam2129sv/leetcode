class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}