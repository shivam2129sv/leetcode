class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int x) {
        List<Boolean> list = new ArrayList<>();
        int n = arr.length;
        int max = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        for(int i = 0; i<n; i++){
            if(arr[i]+x>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}