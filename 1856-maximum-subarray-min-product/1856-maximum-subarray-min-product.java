class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        long maxProd = 0;

        long[] prefix = new long[n + 1];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            prefix[i+1] = prefix[i]+nums[i];
        }
        
        for(int i = 0; i <= n; i++){


            while(!stack.isEmpty() && (i==n || nums[stack.peek()] >= nums[i])){
                int mid = stack.pop();

                int left = stack.isEmpty() ? 0 : stack.peek() + 1;
                int right = i - 1;

                long sum = prefix[right + 1] - prefix[left];
                long minProd = sum * nums[mid];

                maxProd = Math.max(maxProd, minProd);
            }

            if(i < n) stack.push(i);
        }

        return (int)(maxProd % 1_000_000_007);
    }
}