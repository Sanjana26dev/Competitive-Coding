class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n<3){
            return false;
        }
        boolean isVowel=false;
        boolean isConstant=false;
        for(int i =0;i<n;i++){
            char ch=word.charAt(i);
            if(ch >='0' && ch<='9'){
                continue;
            }
            else if(ch>='a' && ch <='z'){
                if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    isVowel=true;
                }else{
                    isConstant=true;
                }
            }else if(ch>='A' && ch <='Z'){
                if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    isVowel=true;
                }else{
                    isConstant=true;
                }
            }

            else{
                return false;
            }
        }
        return isVowel && isConstant;
    }
}