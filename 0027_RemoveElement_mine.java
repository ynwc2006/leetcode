class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length==0) return 0;
        if (nums.length ==1)
            return nums[0]==val?0:1;
        
        int start=0, end=nums.length-1;
        int t;
        while(start<end){
            if (nums[end]==val) {
                end-=1;
                continue;
            }
            if (nums[start]!=val){
                start+=1;
                continue;
            }
            else {
                t=nums[end];
                nums[end]=nums[start];
                nums[start]=t;
            }
        }
        
        if (end==0 && nums[end]==val) return 0;
        return start+1;
        
    }
}
