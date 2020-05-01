class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0) return;
        if(nums.length<=1) return;
        if(k>=1){
            int t=nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=t;
            rotate (nums,k-1);
            
        }
        return;
    }
}
