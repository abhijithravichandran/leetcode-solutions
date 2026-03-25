class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combinations(target,candidates,res,list,0);
        return res; 
    }

    public void combinations(int tar,int[] arr,List<List<Integer>> res, List<Integer> list, int ind){
        if(tar <=0 || ind == arr.length){
            if(tar==0){
                res.add(new ArrayList<>(list));
            }
            return; 
        }

        tar -= arr[ind];
        list.add(arr[ind]);
        combinations(tar,arr,res,list,ind);

        tar+= arr[ind];
        list.remove(list.size()-1);
        combinations(tar,arr,res,list,ind+1);
    }
}