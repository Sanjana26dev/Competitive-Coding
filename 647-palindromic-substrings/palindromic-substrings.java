class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i =0;i<s.length();i++){
            ans+=checkPalindrome(s,i,i);
            ans+=checkPalindrome(s,i,i+1);
        }
        return ans;


        
    }
    public int checkPalindrome(String s ,int left,int right){
        int L=left;
        int R=right;
        int count =0;
        while(L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
            L--;
            R++;
            count++;
        }
        return count;
    }
}
        
    