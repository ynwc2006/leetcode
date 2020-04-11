class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int[] ans = new int[2];
        ans[0] = searchLeft(nums,left,right,target);
        ans[1] = searchRight(nums,left,right,target);
        return ans;
    }
    
    public int searchLeft(int[] nums,int l,int r, int target){
        if(l>r) return-1;
        int mid=(l+r)/2;
        if (nums[mid]<target) return searchLeft(nums,mid+1,r,target);
        else if (nums[mid]==target & (mid==0 || nums[mid-1]!=target)) return mid;
        else return searchLeft(nums,l,mid-1,target);
    }
                 
      public int searchRight(int [] nums,int l,int r, int target){
        if(l>r) return-1;
        int mid=(l+r)/2;
        if (nums[mid]>target) return searchRight(nums,l,mid-1,target);
        else if (nums[mid]==target & (mid==nums.length-1 || nums[mid+1]!=target)) return mid;
        else return searchRight(nums,mid+1,r,target);
    }
}
