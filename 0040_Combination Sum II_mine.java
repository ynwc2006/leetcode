 Combination Sum II
 class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> templist=new ArrayList<>();
       /* if (candidates.length==1) {
            if (candidates[0]==target) list.add(Arrays.asList(1));
            return list;
        }*/
        backtrace(candidates,target,list,templist, 0);
        return list;
    }
    
    private void backtrace(int[] nums, int remain, List list, List templist,int start){
        if(remain<0) return;
        if(remain==0) {list.add(new ArrayList(templist)); return;}
        //if(start>nums.length) return;
        
       /* if(remain==nums[start]){
            templist.add(nums[start]);
            list.add(new ArrayList(templist)); 
            templist.remove(templist.size()-1);
            return;
        }*/
        
        for(int i= start;i<nums.length;i++){
            while(i>start && i<nums.length && nums[i]==nums[i-1]) {i++;}
            if(i<nums.length)  {
            templist.add(nums[i]);
            /*if(i==nums.length-1) {
                if(remain==nums[i]){list.add(new ArrayList(templist)); }
                    }
            else{*/
             backtrace(nums,remain-nums[i],list,templist,i+1);
            
            templist.remove(templist.size()-1);
            }
        }
        return;
    }
}
