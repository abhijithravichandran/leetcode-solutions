class Solution {
    public int distributeCandies(int[] candyType) {
        int canEat = candyType.length/2; 
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i < candyType.length; i++){
            seen.add(candyType[i]);
        }
        int type = seen.size();
        if(canEat > type){
            return type; 
        }
        return canEat; 
    
    }
}