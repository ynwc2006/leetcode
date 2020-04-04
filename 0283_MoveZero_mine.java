class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        if(len==0 || len==1) return ;
        int l=0;
        int r=0;
        while(l<len && r<len) {
                while(r<len-1 && nums[r]==0) {r++;}
                int t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
                l++;
                r++;
            }
        return ;
        }
    }
