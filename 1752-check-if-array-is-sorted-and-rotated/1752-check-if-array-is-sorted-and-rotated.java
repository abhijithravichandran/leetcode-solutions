class Solution {
    public boolean check(int[] nums) {
        int n = nums.length, count = 0; 
        for(int i = 0; i < n;i++){
            if(nums[i] > nums[(i+1)%n]){
                count++; 
            }
        }

        return count <= 1;
    }
}

/*
A sorted rotated array can have only one place where order breaks.

Example:

[3,4,5,1,2]

Look carefully:

3 < 4
4 < 5
5 > 1   ← break
1 < 2
2 < 3   ← circular comparison

There is ONLY ONE descending point.

That’s the entire problem.
*/