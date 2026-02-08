class NumMatrix {

    int[][] matrix; 

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        int n = matrix.length; 
        int m = matrix[0].length; 


        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                
                int above = (i > 0) ? matrix[i-1][j]: 0;
                int left = (j > 0) ? matrix[i][j-1] : 0; 
                int common = (i > 0 && j > 0) ? matrix[i-1][j-1] : 0; 

                matrix[i][j] += above + left - common; 
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1==0 && col1==0) return matrix[row2][col2];

        int above = (row1 > 0) ? matrix[row1-1][col2] : 0; 
        int left = (col1 > 0) ? matrix[row2][col1-1] : 0; 
        int common = (row1 > 0 && col1 > 0 ) ? matrix[row1-1][col1-1] : 0; 

        return matrix[row2][col2] - above - left + common; 
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */