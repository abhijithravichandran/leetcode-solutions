class Solution {
    public int fib(int n) {
       if(n<=1) return n; 
       return fib(n-1) + fib(n-2);
    }
}

// This is true magic, - the recursion just makes it work, and it is amazing and wonderful 