class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length, cnt = 0; 

        for(int i = 0; i < n; i++){
            int cur = arr[i];
            if(cur%2!=0){
                cnt++; 
            }
            else cnt = 0; 

            if(cnt >= 3) return true; 
        }

        return false; 
    }
}