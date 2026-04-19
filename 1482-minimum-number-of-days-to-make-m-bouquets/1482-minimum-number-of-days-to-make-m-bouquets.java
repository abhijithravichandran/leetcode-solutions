class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length/k < m) return -1; 
        int low = 1, high = Arrays.stream(bloomDay).max().getAsInt();

        while(low <= high){

            int mid = low + (high-low)/2;

            if(bouquet(bloomDay,mid,k,m)){
                
                high = mid - 1; 
            }
            else{
                low = mid + 1; 
            }
        }

        return low; 

    }

    public boolean bouquet(int[] bloomDay, int d,int k,int m){
        int curB = 0, totalB = 0; 

        for(int b: bloomDay){

            if(b <= d){
                curB++; 
            }
            else{
                curB = 0; 
            }

            if(curB==k){
                totalB++; 
                curB = 0; 
            }
        }

        return totalB>=m;

    }
}