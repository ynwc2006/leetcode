class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length;
        if(len<=1) return;
        int l=0,r=len-1,i=0;//l the next place to put 0; r the next place to put 2;
        while(i<=r){
            if(nums[i]==1) i++;
            else  if(nums[i]==0){
                nums[i]=nums[l];
                nums[l]=0;
                l++;
                i++;
            }
            else if(nums[i]==2){
                nums[i]=nums[r];
                nums[r]=2;
                r--;
              
            }
      
        }
        return ;
    }
}
