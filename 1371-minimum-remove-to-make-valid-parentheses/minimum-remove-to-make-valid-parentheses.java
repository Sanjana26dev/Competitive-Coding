class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> removeindices=new HashSet<>();
        Stack<Integer> stack=new Stack<>();
        for(int i =0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                stack.push(i);

            }
            else if(c==')'){
                if(stack.isEmpty()){
                    removeindices.add(i);
                }
                else{
                    stack.pop();
                }
            }

        }
        while(!stack.isEmpty()){
            removeindices.add(stack.pop());
        }
        StringBuilder result=new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(!removeindices.contains(i)){
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}