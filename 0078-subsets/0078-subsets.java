class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        subsequence(0,nums,list,res);
        return res; 
    }
    public void subsequence(int index, int[] arr, List<Integer> list, List<List<Integer>> result){
        if(index >= arr.length){
            result.add(new ArrayList<>(list));
            return; 
        }

        list.add(arr[index]);
        subsequence(index+1,arr,list,result);

        list.remove(list.size()-1);
        subsequence(index+1,arr,list,result);
    }
}