class RecentCounter {

    Queue<Integer> q;
    int range; 

    public RecentCounter() {
        q = new LinkedList<>();
        range = 3000; 
    }
    
    public int ping(int t) {
        int curRange = t - range; 
        q.offer(t);
        while(!q.isEmpty() && q.peek() < curRange){
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */