class MyCircularQueue {
    int[] q; 
    int front; 
    int rear; 
    int capacity; 
    int size; 

    public MyCircularQueue(int k) {
        q = new int[k];
        capacity = k; 
        front = -1; 
        rear = -1; 
    }
    
    public boolean enQueue(int value) {
        if(isEmpty()){
            front = 0; 
            rear = 0; 
            q[front] = value; 
        }
        else if(size!=capacity) {
            rear = (rear+1)%capacity; 
            q[rear] = value; 
            
        }
        else{
            return false; 
        }
        size++; 
        return true; 
        
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false; 
        else if(size==1){
            front=-1;
            rear = -1; 
        }
        else{
            front = (front+1) % capacity; 
        }
        size--; 
        return true; 
    }
    
    public int Front() {
        if(isEmpty()) return -1; 
        return q[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;  
        else return q[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return capacity == size; 
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */