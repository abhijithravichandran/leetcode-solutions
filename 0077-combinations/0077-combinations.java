class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i = 1; i < n+1; i++){
            arr[i-1] = i; 
        }
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        combo(arr,0,res,k,n,list);

        return res; 

    }

    public void combo(int[] arr,int st,List<List<Integer>> res, int k, int n, List<Integer> list){

        if(k==0){
            res.add(new ArrayList<>(list));
            return; 
        }

        for(int i = st; i < n; i++){

            list.add(arr[i]);
            combo(arr,i+1,res,k-1,n,list);
            list.remove(list.size()-1);
        }
    }
}