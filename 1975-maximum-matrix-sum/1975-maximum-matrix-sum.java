class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int negaCount = 0, absMin = Integer.MAX_VALUE; 
        long absSum = 0; 
        int len = matrix.length;


        for(int i = 0; i < len; i++){
            
            for(int j = 0; j < len; j++){
                int val = matrix[i][j];
                
                if(val < 0) negaCount++; 
                
                int absVal = Math.abs(val);
                absMin = Math.min(absVal,absMin);
                absSum += absVal; 
                
            }
        }

        if(negaCount % 2 == 1){
            absSum -= (2L * (absMin));
        }
        return absSum; 


    }
}