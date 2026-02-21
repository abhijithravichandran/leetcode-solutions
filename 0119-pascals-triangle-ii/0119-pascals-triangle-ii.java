class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if(rowIndex==0) return new ArrayList<>(Arrays.asList(1));
        long ele = 1;  
        res.add(1);
        for(int col = 1; col <= rowIndex; col++){
                ele *= (rowIndex-col+1);
                ele = ele/col; 
                res.add((int) ele);
        }
        return res; 
    }
}

