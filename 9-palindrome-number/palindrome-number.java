class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int duplicate = 0;
        while(x>0){
            int n = x%10;
            duplicate = duplicate*10 + n;
            x = x/10;
        }
        if(duplicate==num){
            return true;
        }
        else{
            return false;
        }

        
    }
}