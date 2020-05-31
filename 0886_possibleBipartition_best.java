class Solution {
    ArrayList<Integer>[] neighbors;
    HashMap<Integer,Integer> map;

    public boolean possibleBipartition(int N, int[][] dislikes) {
        neighbors=new ArrayList[N+1];
        for(int i=1;i<N+1;i++) neighbors[i]=new ArrayList<>();
        map=new HashMap<>();
        
        for(int i=0;i<dislikes.length;i++){
            int a=dislikes[i][0];
            int b=dislikes[i][1];
            neighbors[a].add(b);
            neighbors[b].add(a);
        }
        
        for(int i=1;i<=N;i++){
           if(!map.containsKey(i) && !dfs(i,-1))
                return false;
        }
        return true;
    }
    
    boolean dfs(int node,int tag){
        if(map.containsKey(node))
            return map.get(node)==tag;
        map.put(node,tag);
        for(int neighbor:neighbors[node]){
            if( !dfs(neighbor,-tag) ) return false;
        }
        return true;
    }
    
}
