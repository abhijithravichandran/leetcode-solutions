class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // int count = 0; 
        // int i = 0; 
        int n = tickets.length; 

        // if(n <  k) return 0; 
        int prefix = 0, suffix = 0; 


        for(int i = 0; i < k; i++){
            if(tickets[i] < tickets[k]) prefix += tickets[i];
            else prefix += tickets[k]; 
        }
        prefix += tickets[k];

        if(tickets[k] < 2) {
            return prefix; 
        }
        int tar = tickets[k]-1;

        for(int i = k+1; i < n; i++){
            if(tickets[i] > tar) suffix += tar; 
            else suffix += tickets[i];
        }

        return prefix + suffix; 
        // while(true){

        //     if(tickets[k]==0){
        //         return count; 
        //     }
           

        //     if(tickets[i]==0) {
        //         i = (i+1)%n;
        //         continue; 
        //         } 
        //     tickets[i] = tickets[i]- 1; 
        //     count++; 
        //     i = (i+1)%n;
        // }

    }
}

// I solved and it first with overall idea, and then again I know for sure that this problem can be solved thorugh math, 
// so I worked on it, and finally I did solved it all by  myself wwithout any help/nor the reference. I just made it happen, 
// this proves that I'm getting so much better and greater... So, if I try hard enough, and push enough then definitely I'll become something more and graeter. I can feel that I'm getting so  much better and better at coding, and with more practice I'll get much more better. 