class Solution {
    public void rotate(int[][] matrix) {
        int bottomBoundary = matrix.length/2; 
        int leftBoundary = matrix.length-1; 
        int len = matrix.length;  
        for(int i = 0; i < bottomBoundary; i++){
            for(int j = i ; j < leftBoundary-i;j++){

                int top = matrix[i][j]; 

                matrix[i][j] = matrix[len-1-j][i];

                matrix[len-1-j][i] = matrix[len - 1 -i][len-1-j];

                matrix[len - i - 1][len-1-j] = matrix[j][len-i-1];

                matrix[j][len-1-i] = matrix[j][len - 1 - i];

                matrix[j][len - 1 - i] = top;

            }
        }
    }
}


// Truth be told, I don't have that mental capacity.... to think through like normal 1D array, but I'm heading towards it, and Soon I'll achieve it... 