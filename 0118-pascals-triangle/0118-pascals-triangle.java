class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<>();
        

        for(int  i = 0; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            long ans = 1; 
            list.add(1);
            for(int col = 1; col <= i; col++){
                ans = ans *(i-col+1)/col; 
                list.add((int) ans);
            }
            res.add(list);
        }
        return res; 
    }
}