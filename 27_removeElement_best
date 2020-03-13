class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int len=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=nums[len]){
                len+=1;
                nums[len]=nums[i];
                
            }
            
        }
        return len+1;
    }
}
