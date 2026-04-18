class Solution {
    public boolean canWinNim(int n) {
        if(n <= 3) return true; 
        // Case 1: Taking 3 and winning 
        // if(n%3==0) return true; 
        
        // // Case 2: Taking 2 and winning 
        // int turn = n/2, rem = n%3;
        // if(turn%2==0 && (rem <= 3)) return true; 

        // // Case 3: Taking 1 and winning
        

        // return false; 

        if(n%4==0) return false; 

        return true; 
    }
}