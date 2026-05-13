class Solution {
    public int splitArray(int[] nums, int k) {
        // int low = Arrays.stream(nums).max().getAsInt(), high = Arrays.stream(nums).sum();
        int low = 0, high = 0; 

        for(int i: nums){
            low = Math.max(low,i);
            high += i; 
        }


        while(low <= high){
            
            int mid = low + (high-low)/2;

            if(split(nums,k,mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1; 
            }

        }

        return low; 
    }

    public boolean split(int[] arr, int k, int d){
        int sum = 0, curSplit = 1; 

        for(int a: arr){

            if(sum + a > d){
                curSplit++; 
                sum = a; 
            }
            else{
                sum += a; 
            }
        }

        return curSplit <= k; 
    }
}


// Whenever it comes to BS on answer, then we need to decide on which should we search for answer, in range of what. Here the [max-totalSum] - this is the range here. 
/* I was able to solve this probelm easily within 10min, and that's because it's exactly the pattern of previous problem, and don't confuse with minOfmax , it's just BS ON ANSWER, all we need to think is, which direction should we move when we hit hit the answer and that is only thing influenced by minOfMax */