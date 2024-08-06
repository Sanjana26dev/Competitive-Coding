class Solution {
    public boolean isPalindrome(String s) {
        int begin =0;
        int end = s.length()-1;
        while(begin<end){
            while(begin<end && !Character.isLetterOrDigit(s.charAt(begin))){
                begin++;
            }
            while(begin <end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(begin))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            begin++;
            end--;
        }
        return true;
        
    }
}