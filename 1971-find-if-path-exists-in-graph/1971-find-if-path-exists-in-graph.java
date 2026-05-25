class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] seen = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        seen[source] = true; 
        q.offer(source);

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int v = edge[0];
            int u = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        while(!q.isEmpty()){
            int temp = q.poll();

            if(temp==destination) return true; 

            for(int u: adj.get(temp)){
                if(!seen[u]){
                    q.offer(u);
                    seen[u] = true; 
                }
            }
        }

        return false; 
    }
}