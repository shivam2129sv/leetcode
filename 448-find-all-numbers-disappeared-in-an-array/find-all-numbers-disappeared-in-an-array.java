class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> set = new ArrayList<>();
        int n = arr.length;
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i<n; i++){
            s.add(arr[i]);
        }
        for(int i = 1; i<=n; i++){
            if(!s.contains(i)){
                set.add((i));
            }
        }
        
        return set;
    }
}