//if you can jump over 0, not stuck in there, you can reach the end
class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==0) return false;
        if(nums.length==1) return true;
        if(nums[0]==0) return false;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==0){
            int j=i-1;
            while(j>=0){
               if (nums[j]>i-j) break;
                j--;
            }
            if(j<0) return false;
        }
    }
        return true;
    }
}
