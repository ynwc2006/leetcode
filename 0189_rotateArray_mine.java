//solution1
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

//solution 2
class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0) return;
        if(nums.length<=1) return;
        int[] temp=new int[k];
        int len=nums.length;
        k=k%len;
        for(int i=0;i<=k-1;i++){
            temp[i]=nums[len-k+i];
        }
        for(int i=len-1;i>=k;i--){
            nums[i]=nums[i-k];
            
        }
        for(int i=k-1;i>=0;i--)
            nums[i]=temp[i];
        return;
    }
}
