class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        // int i = 0, j = i+1, k = nums.length-1; 
        List<List<Integer>> res = new ArrayList<>();
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        for(int k = 0; k < nums.length-2; k++){

            int i = k+1, j = nums.length-1; 
            
            while(i < j){
                
                if(nums[k]+nums[i]+nums[j]==0 ) {
                    res.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    i++; 
                    j--; 
                    List<Integer> li = res.get(res.size()-1);
                    map.put(li, map.getOrDefault(li,0)+1);
                }
                else if(nums[k]+nums[i]+nums[j] > 0){
                    j--;
                }
                else{  
                    i++;
                }
            } 
        }
        List<List<Integer>> finalRes =new ArrayList<>();

        for(int i = 0; i < res.size();i++){
                // if(res.get(i).equals(res.get(i-1))){
                //         res.remove(i);
                // }
                if(map.containsKey(res.get(i)) && map.get(res.get(i))==1){
                    map.put(res.get(i), map.getOrDefault(res.get(i),0)-1);
                    // map.remove(res.get(i));
                    finalRes.add(res.get(i));
                }
                else if(map.containsKey(res.get(i))) {
                    map.remove(res.get(i));
                    finalRes.add(res.get(i));
                }
        }

        return finalRes; 
    }
}