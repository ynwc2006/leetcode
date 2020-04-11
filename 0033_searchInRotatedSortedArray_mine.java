class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        if(len==0) return -1;
        if(len==1) return (nums[0]==target)?0:-1;
        int left=0;
        int right=len-1;
        int mid=(right+left)/2;
        
        
        if (nums[0]>nums[1]) return (nums[0]==target)?0:partSearch(nums,1,len-1,target);
        if(nums[len-1]<nums[len-2]) return (nums[len-1]==target)?len-1:partSearch(nums,0,len-2,target);
        if(nums[0]<nums[len-1]) return partSearch(nums,0,len-1,target);
        
        while (left<=right){
            mid=(right+left)/2;
            if(nums[mid] > nums[mid-1] && nums[mid]>nums[mid+1]) break;
            if(nums[left]>nums[mid]) right=mid;
            if(nums[right]<nums[mid]) left=mid;
        }
        
        int a = partSearch(nums,0,mid,target);
        int b = partSearch(nums,mid+1,len-1,target);
        if(a==-1) return b;
        return a;
        }
                    
                    
    private int partSearch(int[] nums,int l, int r, int target)  {
        if(l>r) return -1;
        int mid=(l+r)/2;
        if(target==nums[mid]) return mid;
        else if (target<nums[mid]) return partSearch(nums,l,mid-1,target);
        else return partSearch(nums,mid+1,r,target);
    }
}
