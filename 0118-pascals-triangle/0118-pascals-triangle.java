class Solution {
    public List<List<Integer>> generate(int rows) {
        List<List<Integer>> res = new ArrayList<>(new ArrayList<>());
        
        if(rows==0) return res; 
        else if(rows==1){
            res.add(Arrays.asList(1));
            return res; 
        }
        else if(rows==2){
            res.add(Arrays.asList(1));
            res.add(Arrays.asList(1,1));
            return res; 
        }
        res.add(Arrays.asList(1));
        res.add(Arrays.asList(1,1));

        for(int i = 2; i < rows; i++){

            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j < res.get(i-1).size();j++){
                int sum = res.get(i-1).get(j) + res.get(i-1).get(j-1);
                row.add(sum);
            }
            row.add(1);
            res.add(row);
        }
        return res; 
    }
}