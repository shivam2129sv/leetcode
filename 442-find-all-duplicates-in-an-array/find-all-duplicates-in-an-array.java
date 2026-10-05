class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> set = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > 1) {
                set.add(arr[i]);
            }
        }
        return set;
    }
}