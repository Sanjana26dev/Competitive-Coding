class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,d,temp;
        temp=x;
        while(x>0){
            
            d = x % 10;
            rev = rev * 10 + d ;
            x=x/10;
        }
        if(temp==rev)
            return true;
        else
            return false;
    }
}