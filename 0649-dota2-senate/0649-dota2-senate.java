class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qR = new LinkedList<>();
        Queue<Integer> qD = new LinkedList<>();
        int n = senate.length();

        for(int i = 0; i < n;i++){
            char cur = senate.charAt(i);
            if(cur=='D'){
                qD.offer(i);
            }
            if(cur=='R'){
                qR.offer(i);
            }
        }

        while(!qD.isEmpty() && !qR.isEmpty()){
            int r = qD.poll();
            int d = qR.poll();

            if(r < d){
                qD.offer(r+n);
            }
            else{
                qR.offer(d+n);
            }
        }

        if(!qD.isEmpty()) return "Dire";
        else return "Radiant";

    }
}
