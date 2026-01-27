class Solution {
    public int[] decrypt(int[] code, int k) {
        int windowSum = 0; 
        int n = code.length; 
        int[] ans = new int[n];
        
        if(k==0) return ans; 

        if(k > 0){ 
        for(int i = 1; i <= k; i++){
            windowSum += code[i%n];
        }
        

        for(int i = 0; i < n; i++){

            ans[i] = windowSum;
            windowSum -= code[(i+1)%n];
            windowSum += code[(i+k+1)%n];
        }
    } else {
            k = -k;

            // initial window for index 0
            for (int i = 1; i <= k; i++) {
                windowSum += code[(n - i) % n];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = windowSum;
                windowSum -= code[(n + i - k) % n];
                windowSum += code[i % n];
            }

        
    }
    return ans; 
    
}
}