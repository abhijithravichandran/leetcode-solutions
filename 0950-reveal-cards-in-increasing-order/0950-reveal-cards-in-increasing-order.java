class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        int n = deck.length;  
        int[] ans = new int[n];
        Arrays.sort(deck);
        int j = 0; 

        for(int i = 0; i < n; i++){
            q.add(i);
        }
        
        while(!q.isEmpty()){
            int indx = q.poll();
            ans[indx] = deck[j];
            if(q.isEmpty()) break;  
            int move = q.poll();
            q.add(move);
            j++; 
        }

        return ans; 


    }
}