class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        if(numRows==0) return res; 
        res.add(Arrays.asList(1));
        if(numRows==1) return res; 
        res.add(Arrays.asList(1,1));
        if(numRows==2) return res; 

        for(int i = 2; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int sum = 0; 
            for(int j = 0; j < res.get(i-1).size()-1;j++){
                sum = res.get(i-1).get(j) + res.get(i-1).get(j+1);
                row.add(sum);
            }

            row.add(1);
            res.add(row);
        }

        return res; 
    }
}