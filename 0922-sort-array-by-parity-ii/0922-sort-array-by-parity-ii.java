class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0, odd = 1; 
        int n = nums.length; 

        while(true){

            while( even < n && nums[even]%2==0){
                even += 2; 
            }

            while( odd < n && nums[odd]%2!=0){
                odd += 2; 
            }

            if(even < n && odd < n){
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp; 
            }
            else{
                break; 
            }
        }

        return nums; 
    }
}