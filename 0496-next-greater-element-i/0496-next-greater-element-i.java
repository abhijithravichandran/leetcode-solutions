class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length; 
        int[] res = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        nextGreater(nums2,res, map);
        
        int len = nums1.length; 
        int[] result = new int[len];
        for(int i = 0; i < len; i++){
            result[i] = map.get(nums1[i]);
        }

        return result; 
    }

    public void nextGreater(int[] nums, int[] res, HashMap<Integer,Integer> map){
        Stack<Integer> stack = new Stack<>();
        int n = nums.length; 
        stack.push(nums[n-1]);
        res[n-1] = stack.peek();
        map.put(nums[n-1],-1);

        for(int i = n-2; i >= 0; i--){
            int cur = nums[i];

            while(!stack.isEmpty() && stack.peek() <= cur){
                stack.pop();
            }
            if(!stack.isEmpty()) {
                res[i] = stack.peek();
                map.put(cur,stack.peek());
            }
            else{
                 res[i] = -1; 
                map.put(cur,-1);
            }
            stack.push(cur);
        }
        
    }
}