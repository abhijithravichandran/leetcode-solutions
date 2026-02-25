class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long ele = 1; 
        list.add(1);

        for(int col = 1; col <= rowIndex; col++){
            ele *= (rowIndex-col+1);
            ele = ele/col; 
            list.add((int) ele);
        }
        return list; 
    }
}