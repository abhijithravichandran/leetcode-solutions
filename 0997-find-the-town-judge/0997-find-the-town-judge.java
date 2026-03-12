class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean[] trusts = new boolean[n];

        if(n==1 && trust.length==0) return 1; 

        for(int i = 0; i < trust.length; i++){
            int num = trust[i][1];
            trusts[trust[i][0]-1] = true;
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int target = n-1; 
        
        for(int num: map.keySet()){
            int val = map.get(num);
            if(val==target && !trusts[num-1]) return num; 
        }

        return -1; 
        
    }
}