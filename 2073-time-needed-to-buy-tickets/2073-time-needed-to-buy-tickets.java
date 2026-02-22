class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length; 

        int cnt = 0; 

        for(int i = 0; i < k;i++){
            if(tickets[i] < tickets[k]) cnt += tickets[i];
            else cnt += tickets[k]; 
        }
        cnt += tickets[k];
        if(tickets[k] < 2){
            return cnt; 
        }
        int tar = tickets[k]-1;
        for(int i = k+1; i < n; i++){
            if(tickets[i] > tar){
                cnt += tar;
            }
            else cnt += tickets[i];
        }
        return cnt; 

    }
}