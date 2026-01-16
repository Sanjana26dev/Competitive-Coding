class Solution {
public boolean isValid(String s) {
Stack<Character> stack = new Stack<>();


int i = 0;


while(i < s.length()){
char ch = s.charAt(i);


if(stack.isEmpty() || ch == '(' || ch == '[' || ch == '{'){
stack.push(ch);
}else{
if((ch == ')' && stack.peek() == '(') || (ch == ']' && stack.peek() == '[') || (ch == '}' && stack.peek() == '{')){
stack.pop();


}else{
return false;
}
}
i++;
}


if(stack.size() == 0){
return true;
}else{
return false;
}
}
}
