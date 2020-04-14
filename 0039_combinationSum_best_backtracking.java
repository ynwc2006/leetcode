class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list= new ArrayList<>();
        Arrays.sort(candidates);
        backtrace(list, new ArrayList<Integer>(), candidates,0,target);
        return list;
    }
    
    private void backtrace(List<List<Integer>> list, ArrayList<Integer> templist, int[] nums,int start,int remain){
        if(remain<0) return;
        if(remain==0) list.add(new ArrayList(templist));
        for(int i=start;i<nums.length;i++){
            templist.add(nums[i]);
            backtrace(list,templist,nums,i,remain-nums[i]);
            templist.remove(templist.size()-1);
        }
        return;
    }
}
