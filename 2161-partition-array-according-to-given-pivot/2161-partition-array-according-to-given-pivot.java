class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> larger = new ArrayList<>();
        int midCnt = 0; 

        for(int num: nums){
            if(num==pivot) midCnt++; 
            else if(num > pivot) larger.add(num);
            else if(num < pivot) smaller.add(num);
        }

        for(int i = 0; i < smaller.size(); i++){
            nums[i] = smaller.get(i);
        }
        int ind = smaller.size(); 
        for(int i = 0; i < midCnt; i++){
            nums[ind++] = pivot; 
        }
        int index = 0; 
        for(int i = 0; i < larger.size(); i++){
            nums[ind++] = larger.get(i);
        }
        return nums; 

       
    }   

}