class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] occurance = new int[26];
        int left=0;
        int right =0;
        int ans =0;
        int maxoccurance=0;
        for( right=0;right<s.length();right++){
            maxoccurance=Math.max(maxoccurance,++occurance[s.charAt(right)-'A']);
            if(right-left+1-maxoccurance>k){
                
                occurance[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}