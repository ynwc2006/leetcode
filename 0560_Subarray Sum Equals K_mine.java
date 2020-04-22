class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length==0) return 0;
        int count=0;
        int[] sum=new int [nums.length];
        
        for(int i=0;i<nums.length;i++)  {
            if(i==0) sum[i]=nums[i];
            else sum[i]=sum[i-1]+nums[i];
            
            if (sum[i]==k) count++;
        } 
        
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++){
                if(sum[j]-sum[i]==k) count ++;
            }
        return count;
    }
}
