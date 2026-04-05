class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1; 
        }
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        combo(arr,res,list,0,k);
        return res; 

    }

    public void combo(int[] arr, List<List<Integer>> res, List<Integer> list, int ind, int k){
        if(k==0){
            res.add(new ArrayList<>(list));
            return; 
        }

        for(int i = ind; i < arr.length; i++){

            list.add(arr[i]);
            combo(arr,res,list,i+1,k-1);
            list.remove(list.size()-1);
        }

    }
}