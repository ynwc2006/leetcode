class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        int p=len-1;
        int start=0;
        int i,j;
        for(i=len-1;i>=1;i--){
            if(nums[i-1]<nums[i])
            break;
            
        }
        if(i>0){
            for(j=len-1;j>i-1;j--){
                if (nums[j]>nums[i-1])
                    break;
            }
            swap (nums, i-1,j);
        }
        reverse(nums,i,len-1);
        return;
    }
    
    
    private void swap(int[] nums, int i, int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
        return;
    }
    
    private void reverse(int[] nums, int i, int j){
        while(j>i){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
