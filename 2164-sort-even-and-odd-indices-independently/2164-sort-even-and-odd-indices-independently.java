class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> listOdd = new ArrayList<>();
        ArrayList<Integer> listEven = new ArrayList<>();



        for(int i = 0; i < nums.length; i++){
            if(i%2==0){
                listEven.add(nums[i]);
            }
            else{
                listOdd.add(nums[i]);
            }
        }
        Collections.sort(listEven);
        Collections.sort(listOdd, Collections.reverseOrder());
        int k = 0, j = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2==0){  
                nums[i] = listEven.get(k++);
            }
            else{
                nums[i] = listOdd.get(j++);
            }
        }

        return nums; 

    }
}