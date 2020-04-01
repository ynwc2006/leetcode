class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                sum+=nums[i];
                map.put(nums[i],i);
            }
            else sum-=nums[i];
        }
        return sum;
    }
}
