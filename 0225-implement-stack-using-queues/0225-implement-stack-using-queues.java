class MyStack {
    Deque<Integer> q; 
    int size = 0; 
    public MyStack() {
        q = new ArrayDeque();
    }
    
    public void push(int x) {
        q.offer(x);
        size++; 
    }
    
    public int pop() {
        size--; 
       return q.removeLast();
    }
    
    public int top() {
        return q.peekLast();
    }
    
    public boolean empty() {
        return size==0; 
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */