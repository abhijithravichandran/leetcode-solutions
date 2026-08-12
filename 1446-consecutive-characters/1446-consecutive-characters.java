class Solution {
    public int maxPower(String s) {
        int n = s.length(), cnt = 1, maxCons = 1; 
        
        if(n==0) return 0; 
        for(int i = 1; i < n; i++){

            char cur = s.charAt(i);
            char unique = s.charAt(i-1);
            if(cur==unique){
                cnt++; 
            }
            else{
                cnt = 1; 
            }
            maxCons = Math.max(maxCons,cnt);
        }

        return maxCons; 

    }
}