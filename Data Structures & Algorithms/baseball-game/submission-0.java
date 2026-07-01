class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int temp=0;
        int top=0;
        int sum =0;
        for(String op: operations){
            if(op.equals("+")){
                temp = stack.pop();
                top = stack.peek();
                stack.push(temp);
                stack.push(temp+top);
                sum = sum + temp + top;
            } else if (op.equals("C")){
                sum = sum - stack.peek();
                stack.pop();
                
            } else if (op.equals("D")) {
                temp = stack.peek();
                stack.push(temp*2);
                sum = sum + (temp)*2;
            } else {
                stack.push(Integer.parseInt(op));
                sum = sum + Integer.parseInt(op);
            }
        }
        return sum;
    }
}