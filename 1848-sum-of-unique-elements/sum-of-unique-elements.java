class Solution {
    public int sumOfUnique(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int number: arr){
            map.put(number, map.getOrDefault(number,0) +1);
        }
        int sum = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                sum = sum + entry.getKey();
            }
        }
        return sum;
    }
}