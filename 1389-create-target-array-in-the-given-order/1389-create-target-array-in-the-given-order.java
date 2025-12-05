class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        Arrays.fill(target,-1);
        for(int i = 0; i < nums.length; i++){
            if(target[index[i]]==-1){
                target[index[i]] = nums[i];
            }
            else {
                rightRotate(target,index[i]);
                target[index[i]] = nums[i];
            }
        }

        return target; 

    }

    public void rightRotate(int[]  target, int index){
        int len = target.length; 

        for(int i = index; i < len-1; i++){
            int temp =target[i+1]; 
            target[i+1] = target[index];
            target[index] = temp;
        }
    }
}