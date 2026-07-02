class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(!(token.equals("+")||token.equals("*")||token.equals("-")||token.equals("/"))){
                stack.push(Integer.parseInt(token));
            } else if(token.equals("+")){
                stack.push(stack.pop()+stack.pop());
            } else if(token.equals("-")){
                stack.push(-stack.pop()+stack.pop());
            } else if(token.equals("*")){
                stack.push(stack.pop()*stack.pop());
            } else if(token.equals("/")){
                int temp = stack.pop();
                stack.push(stack.pop()/temp);
            }
        }
        return stack.peek();
    }
}
