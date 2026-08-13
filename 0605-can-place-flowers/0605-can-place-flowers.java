class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0, len = flowerbed.length; 

        if(len==1){
            if(flowerbed[0]==0){
                cnt++; 
                return cnt >= n;
            }
        }
        

        for(int i = 0; i < len; i++){
            int cur = flowerbed[i];
            if(i-1 < 0 && i+1 < len && flowerbed[i+1]==0){
                if(cur==0) {
                    flowerbed[i] = 1; 
                    cnt++; 
                    }
            }
            else if(i+1 >= len && i-1 >= 0 && flowerbed[i-1]==0){
                if(cur==0) {
                    flowerbed[i] = 1; 
                    cnt++; 
                }
            }
            else{
                if(i-1 >= 0 && i+1 < len && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    if(cur==0) {
                        flowerbed[i] = 1; 
                        cnt++;  
                    }
                }
            }
        }

        return cnt >= n; 
    }


}