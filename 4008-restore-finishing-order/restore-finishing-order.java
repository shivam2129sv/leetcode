class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int [] arr = new int[n];
        int a = 0;
        for(int i = 0; i<order.length; i++){
            for(int j = 0; j<friends.length; j++){
                if(friends[j]==order[i]){
                    arr[a]=order[i];
                    a++;
                }
            }
        }
        return arr;
    }

}