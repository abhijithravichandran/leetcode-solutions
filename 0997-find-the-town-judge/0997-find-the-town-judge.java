class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n+1];

        for(int[] temp: trust){
            int a = temp[0];
            int b = temp[1];

            score[a]--;
            score[b]++; 
        }

        for(int i = 1; i < n+1; i++){
            if(score[i]==n-1) return i; 
        }

        return -1; 
    }
}