class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = 0, ele2 = 0; 
        int cnt1 = 0, cnt2 = 0; 
        int n = nums.length; 

        List<Integer> list = new ArrayList<>();

        for(int num: nums){
            if(cnt1==0 && num!=ele2){
                cnt1 = 1; 
                ele1 = num; 
            }
            else if(cnt2==0 && num!=ele1){
                cnt2 = 1; 
                ele2 = num; 
            }
            else if(ele1==num){
                cnt1++; 
            }
            else if(ele2==num){
                cnt2++; 
            }
            else{
                cnt1--; 
                cnt2--; 
            }
        }

        int count1 = 0, count2 = 0; 
        for(int num: nums){
            if(ele1==num) count1++; 
            if(ele2==num) count2++; 
        }
        if(count1 > n/3)  list.add(ele1);
        if(count2 > n/3 && ele1 != ele2) list.add(ele2);
        return list; 
    }
}