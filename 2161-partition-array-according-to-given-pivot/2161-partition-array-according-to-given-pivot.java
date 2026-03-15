class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        List<Integer> same = new ArrayList<>();

        int n = nums.length; 

        for(int num: nums){
            if(num==pivot) same.add(num);
            else if(num > pivot) larger.add(num);
            else if(num < pivot) smaller.add(num);
        }
        smaller.addAll(same);
        smaller.addAll(larger);

        
        int[] arr = new int[smaller.size()];

        for(int i = 0; i <  smaller.size(); i++){
            arr[i] = smaller.get(i);
        }

        return arr; 
        
    }
}