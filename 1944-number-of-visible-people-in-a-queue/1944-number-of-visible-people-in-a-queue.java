class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int len = heights.length;
        int[] answer = new int[len];
        ArrayList<Integer> stack = new ArrayList<>();

        for(int i = len-1; i>=0; i--){
            int visible = 0; 

            int height = heights[i];
            
            while(!stack.isEmpty() && stack.get(stack.size()-1) < height){
                visible++;
                stack.removeLast();
            }
            if(!stack.isEmpty()) visible++;
            answer[i] = visible; 
            stack.add(height);
        }
        return answer; 

    }
}