class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        
        backtrace(list, new ArrayList<Integer>(), nums);
        return list;
    }
    
    
    private void backtrace(List<List<Integer>> list, List<Integer> templist,int[] nums){
        if (templist.size()==nums.length) {list.add(new ArrayList(templist)); return;}
        for(int i=0;i<nums.length;i++){
            if(templist.contains(nums[i])) continue;
            templist.add(nums[i]);
            backtrace(list,templist,nums);
            templist.remove(templist.size()-1);
        }
        return ;
    }
}
