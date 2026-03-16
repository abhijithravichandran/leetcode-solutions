class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);

        int n = intervals.length; 
        
        int k = 0; 

        for(int i = 1; i < n; i++){

            if(intervals[i][0] <= intervals[k][1]){
                intervals[k][1] = Math.max(intervals[k][1], intervals[i][1]);
            }
            else{
                k++; 
                intervals[k][0] = intervals[i][0];
                intervals[k][1] = intervals[i][1];
            }
        }

        int[][] merged = new int[k+1][2];

        for(int i = 0; i < k+1; i++){
            merged[i][0] = intervals[i][0];
            merged[i][1] = intervals[i][1];
         }

         return merged; 

    }
}