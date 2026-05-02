class MinStack {
    Stack<Integer> stack; 
    Stack<Integer> minStack; 
    Stack<Integer> stack2; 

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        while(!minStack.isEmpty()  && minStack.peek() < val){
            stack2.push(minStack.pop());
        }
        minStack.push(val);
        while(!stack2.isEmpty()){
            minStack.push(stack2.pop());
        }
    }
    
    public void pop() {
        int del = stack.pop();
        while(!minStack.isEmpty() && minStack.peek()!=del){
            stack2.push(minStack.pop());
        }
        minStack.pop();
        while(!stack2.isEmpty()){
            minStack.push(stack2.pop());
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */