class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack=new ArrayDeque<>();

        for(char ch:s.toCharArray()){
           
            
            if(ch=='('||ch=='{'|| ch=='['){
                stack.push(ch);
            }else {
                 if(stack.isEmpty()){
                return false;
            }
            char top=stack.peek();
                if(ch==')'&& top=='('){
              
                }else if(ch==']'&& top=='['){
               
                }else if(ch=='}'&& top=='{'){
           
             }
             else{
                return false;
             }
                stack.pop();
        }
    
        }
        return stack.isEmpty();
    }
}