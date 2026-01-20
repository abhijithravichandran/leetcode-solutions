class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] list = {-1,-1};
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=left; i <= right; i++){
            if(isPrime(i)){
                res.add(i);
            }
        }
        int minL =-1, minR =-1, min = Integer.MAX_VALUE; 
        for(int i = 0; i < res.size()-1; i++){
            int prev = res.get(i+1);
            int cur = res.get(i);
            if(prev-cur < min){
                min = prev-cur; 
                minL = cur; 
                minR = prev; 
            }
        }
        list[0] = minL; 
        list[1] = minR; 
        return list; 
        
    }
    public boolean isPrime(int n){
        if(n <= 1) return false; 
        for(int i =2; i*i <=n; i++){
            if(n%i==0) return false; 
        }
        return true; 
    }
}