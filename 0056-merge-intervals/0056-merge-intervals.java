class Solution {
    public int[][] merge(int[][] intervals) {
        // Arrays.sort(intervals,(a,b) -> a[0]-a[1] );
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int k = 0, n = intervals.length;  

        for(int i = 1; i < n; i++){
            int prev = intervals[k][1];
            int cur = intervals[i][0];
            int next = intervals[i][1];

            if(prev >= cur && prev < next){
                intervals[k][1] = intervals[i][1];
            }

            else if(prev < cur){
                k++; 
                intervals[k][0] = intervals[i][0];
                intervals[k][1] = intervals[i][1];
            }
        }

        int[][] merge = new int[k+1][2];
        for(int i = 0; i < k+1; i++){
            merge[i][0] = intervals[i][0];
            merge[i][1] = intervals[i][1];
        }

        return merge; 

    }
}