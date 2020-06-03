class Solution {
    int[][] memo;
    public int twoCitySchedCost(int[][] costs) {
       memo=new int[costs.length/2+1][costs.length/2+1];
       int ans= dfs(costs,costs.length/2,costs.length/2,0);
        return ans;
    }
    
    int dfs(int[][] costs, int Acap, int Bcap, int start ){
        if(start==costs.length) return 0;
        if(memo[Acap][Bcap]!=0) return memo[Acap][Bcap];
        if(Acap==0){
            return costs[start][1]+dfs(costs,0,Bcap,start+1);
        }
        if(Bcap==0){
            return costs[start][0]+dfs(costs,Acap,0,start+1);
        }
        
        int costA=costs[start][0]+dfs(costs,Acap-1,Bcap,start+1);
        int costB=costs[start][1]+dfs(costs,Acap,Bcap-1,start+1);
        memo[Acap][Bcap]=costA>costB?costB:costA;
        return memo[Acap][Bcap];
    }
}
