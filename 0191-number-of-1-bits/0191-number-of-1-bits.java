class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0; 
        for(int i = binary.length()-1; i>=0 ; i--){
            if(binary.charAt(i)=='1') count++; 
        }
        return count; 
    }
}