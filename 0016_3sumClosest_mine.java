class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        int sum=0;
        
        for(int i=0;i<nums.length-2;i++){
            int lo=i+1;
            int hi=nums.length-1;
            while(lo<hi){
                if(Math.abs(nums[i]+nums[lo]+nums[hi]-target)<diff){
                    sum=nums[i]+nums[lo]+nums[hi];
                    diff=Math.abs(sum-target);    
                    if (diff==0) return sum;
                }
                
                if (nums[i]+nums[lo]+nums[hi]>target) hi--;
                else lo++;
                                
            }
        }
        
        return sum;
    }
}
