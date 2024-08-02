class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0)=='0'){
            return 0;
        }
        int one=1;
        int two=1;
        for(int i =1;i<s.length();i++){
            int cur =0;
            if(s.charAt(i)!='0'){
                cur=one;
            }
            int val = Integer.parseInt(s.substring(i-1,i+1));
            if(val >=10 && val <=26){
                cur=cur+two;
                
            }
            two=one;
            one=cur;
            
        }return one;
    }
}