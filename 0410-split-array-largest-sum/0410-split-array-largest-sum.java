class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt(), high = Arrays.stream(nums).sum();


        while(low <= high){

            int mid = low + (high-low)/2;

            if(splitting(nums,k,mid)){
                high = mid - 1; 
            }
            else{
                low = mid + 1; 
            }
        }
        return low; 

    }

    public boolean splitting(int[] nums, int k, int limit){
        int sum = 0, subArr = 1; 

        for(int i: nums){
            if(sum + i > limit){
                subArr++; 
                sum = i; 
            }
            else{
                sum += i; 
            }
        }

        return subArr <= k; 
    }
}





// Whenever it comes to BS on answer, then we need to decide on which should we search for answer, in range of what. Here the [max-totalSum] - this is the range here. 
/* I was able to solve this probelm easily within 10min, and that's because it's exactly the pattern of previous problem, and don't confuse with minOfmax , it's just BS ON ANSWER, all we need to think is, which direction should we move when we hit hit the answer and that is only thing influenced by minOfMax */