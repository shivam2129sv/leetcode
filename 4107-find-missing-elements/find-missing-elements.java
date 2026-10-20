class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int m = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        } 
         int [] arr1 = new int[max-min + 1];
        int a = 0;
        int n = arr1.length;
        for(int i = 0; i<n; i++){
            arr1[a] = min;
            min++;
            a++;
        }
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<m; j++){
                if(arr1[i]!=arr[j]){
                    count++;
                }
            }
            if(count==m){
                list.add(arr1[i]);
            }
        }
        return list;
    }
}