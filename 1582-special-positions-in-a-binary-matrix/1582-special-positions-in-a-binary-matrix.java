class Solution {
    public int numSpecial(int[][] mat) {
        int r = mat.length; 
        int c = mat[0].length;  
        int[] rows = new int[r];
        int[] cols = new int[c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(mat[i][j]==1){
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        int cnt = 0; 
        // This is the part - I don't get it 
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(mat[i][j]==1 && rows[i]==1 && cols[j]==1) cnt++; 
            }
        }
        return cnt; 

        

        

    }

   
}