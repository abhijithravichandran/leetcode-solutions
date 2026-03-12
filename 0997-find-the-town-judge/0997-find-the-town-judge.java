class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean[] trusts = new boolean[n];

        int j = n*(n+1)/2;

        if(n==1 && trust.length==0) return 1; 

        for(int i = 0; i < trust.length; i++){
            if(!trusts[trust[i][0]-1]) j -= trust[i][0];
            trusts[trust[i][0]-1] = true;
            int num = trust[i][1];
            map.put(num,map.getOrDefault(num,0)+1);
        }

        if(map.containsKey(j) && map.get(j)==n-1 && !trusts[j-1]) return j; 
        return -1; 

    }
        
}