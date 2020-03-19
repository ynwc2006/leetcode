class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int cur=nums[0];
        int len=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=cur){
                len+=1;
                nums[len]=nums[i];
                cur=nums[len];
                
            }
            
        }
        return len+1;
    }
}
