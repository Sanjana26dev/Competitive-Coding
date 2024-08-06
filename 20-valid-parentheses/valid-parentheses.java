class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stackt = new Stack<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                stackt.push(c);
            }
            else{
                if(stackt.empty()){
                    return false;
                }
                char top = stackt.pop();
                if(top!=map.get(c)){
                    return false;
                }
            }
        }
        return stackt.empty();

        
    }
}