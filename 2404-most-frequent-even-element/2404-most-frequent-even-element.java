class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();

        int n = nums.length; 
        int ele = -1; 
        int cnt= 0; 

        for(int num: nums){
           if(num%2==0) {
            map.put(num,map.getOrDefault(num,0)+1);
            int curCnt = map.get(num);
            int curEle = num; 
            if(curCnt > cnt || (curCnt==cnt && curEle < ele)){
                ele = curEle; 
                cnt = curCnt; 
            }
           }

        }
        // int ele = -1; 
        // int cnt= 0; 
        // for(int num: map.keySet()){
        //     if(map.get(num) > cnt || (cnt==map.get(num) && num < ele)){
        //         ele = num; 
        //         cnt = map.get(num);
        //     }
        // }
        return ele; 

    }
}