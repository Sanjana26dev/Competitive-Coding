class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        if(t.length()==0){
            return false;
        }
        if(s.length()==t.length() && s!=t){
            return false;
        }
        
        int i =0,j=0;
        while(i<s.length()){
            if(j==t.length()){
                return false;
            }
            while(j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    j++;
                    break;
                }
                j++;
                
                if(j==t.length()){
                    return false;
                }

            }
            i++;
        }
        return true;
    }
}