class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i:asteroids){
            if(i>0) stack.push(i);
            else{
                while(!stack.isEmpty()&& stack.peek()>0 && stack.peek()<-i) {
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek()==-i) {
                    stack.pop();
                }
                else if(stack.isEmpty() || stack.peek()<0) {
                    stack.push(i);
                }
            }
        }
        int size = stack.size();
        int[] res = new int[size];
        int i=0;
        while(!stack.isEmpty()){
            res[size-i-1] = stack.pop();
            i++;
        }
        return res;
    }
}