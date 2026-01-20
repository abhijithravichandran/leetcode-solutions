class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isSelfDiving(i)){
                res.add(i);
            }
        }
        return res; 
    }
    public boolean isSelfDiving(int n){
        int original = n; 
        while(n > 0){
            int d = n%10;
            if(d==0) return false; 
            if(original % d != 0) return false; 
            n /=10; 
        }
        return true; 
    }
}