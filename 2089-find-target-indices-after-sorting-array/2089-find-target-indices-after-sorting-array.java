class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);

        // int low = 0, high = nums.length-1, startInd = -1; 
        // ArrayList<Integer> indices = new ArrayList<>();

        // while(low <= high){

        //     int mid = low + (high-low)/2;

        //     if(nums[mid] >= target){
        //         if(nums[mid]==target){
        //             startInd = mid; 
        //         }
        //         high = mid - 1; 
        //     }
        //     else{
        //         low = mid + 1; 
        //     }
        // }
        // if(startInd == -1) return indices; 
        // for(int i = startInd; i < nums.length; i++){
        //     if(nums[i]==target) indices.add(i);
        // }

        // return indices; 

        int less = 0, equal = 0; 

        for(int i: nums){
            if(i==target) equal++; 
            else if(i < target) less++; 
        }
        List<Integer> res = new ArrayList<>();
        for(int i = less; i < less+equal; i++){
            res.add(i);
        }

        return res; 
    }
}