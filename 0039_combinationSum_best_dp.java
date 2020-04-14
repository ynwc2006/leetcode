class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>[] dp= new ArrayList[target+1];
        
        for(int t=1;t<=target;t++){
            dp[t]=new ArrayList();
            List<List<Integer>> combineList=new ArrayList();
            
            for(int i=0;i<candidates.length && candidates[i]<=t;i++){
                if (candidates[i]==t) {
                    combineList.add(Arrays.asList(candidates[i]));
                }
                else {
                    for (List<Integer> prevList :dp[t-candidates[i]]){
                       if(prevList.get(prevList.size()-1) <= candidates[i]){
                            List temp=new ArrayList(prevList);
                            temp.add(candidates[i]);
                            combineList.add(temp);
                       }
                    }
                }
            }
            dp[t]=combineList;
        }
        
        return dp[target];
    }
}
