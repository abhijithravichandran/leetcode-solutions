class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        n = Integer.valueOf(n);
        int count = 0; 
        while(n!=0){
          count += n%2; 
          n = n >> 1;  
        }
        return count; 
    }
}