class Solution {
    public String reverseVowels(String s) {
        char st[]= s.toCharArray();
        int left =0;
        int right = st.length-1;
        while(left< right){
            if(isvowel(st[left])== false){
                left++;
            }
            else if(isvowel(st[right])==false){
                right--;
            }
            else{
                char temp= st[left];
                st[left]=st[right];
                st[right]=temp;
                left++;
                right--;
            }
        }
        return new String (st);

        
    }
    public boolean isvowel( char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A'|| c== 'E' || c=='I' || c=='O' || c== 'U' ){
            return true;
        }
        return false; 
    }
}