class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0; 
        int i = 0; 
        int n = tickets.length; 

        if(n <  k) return 0; 

        while(true){

            if(tickets[k]==0){
                return count; 
            }
           

            if(tickets[i]==0) {
                i = (i+1)%n;
                continue; 
                } 
            tickets[i] = tickets[i]- 1; 
            count++; 
            i = (i+1)%n;
        }

    }
}