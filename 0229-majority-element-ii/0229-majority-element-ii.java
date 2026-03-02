class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length; 
        int ele1 = 0, ele2 = 0; 
        int cnt1 = 0, cnt2 = 0; 

        for(int num: nums){
            if(cnt1 == 0 && num!=ele2){
                ele1 = num; 
                cnt1 = 1; 
            }
            else if(cnt2 == 0 && num!=ele1){
                ele2 = num; 
                cnt2 = 1; 
            }
            else if(num==ele1){
                cnt1++; 
            }
            else if(num==ele2){
                cnt2++; 
            }
            else{
                cnt1--; 
                cnt2--; 
            }
        }
        List<Integer> list = new ArrayList<>();
        int count1 =0, count2 = 0; 

        for(int num: nums){
            if(num==ele1) count1++; 
            if(num==ele2) count2++; 
        }

        if(count1 > n/3) list.add(ele1);
        if(count2 > n/3 && ele1!=ele2) list.add(ele2);

        return list; 
        
    }
}