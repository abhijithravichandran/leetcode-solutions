class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length; 
        int l = 0, r = 1; 

        if(n < 2) return nums; 

        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int cur = nums[i];

            if( cur >= 0) positives.add(cur);
            else negatives.add(cur);
        }
        int ind = 0, p=0, ne = 0; 
        for(int i = 0; i < n;i++){
            if(i%2==0){
                nums[i] = positives.get(p++);
            }
            else{
                nums[i] = negatives.get(ne++);
            }
            ind++; 
        }

       
        return nums; 
    }
}