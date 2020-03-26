class Solution {
  //doesn't work to find all the solution. -4,1,3.  -4,0,4
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map <Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                List<Integer> twoSum = new ArrayList<>();
                twoSum.add(i);
                twoSum.add(j);
                map.put(-nums[i]-nums[j],twoSum);
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                if (i==map.get(nums[i]).get(0) || i==map.get(nums[i]).get(1)){
                 continue;   
                }
                List<Integer> oneAns = new ArrayList<>();
                oneAns.add(nums[i]);
                oneAns.add(nums[map.get(nums[i]).get(0)]);
                oneAns.add(nums[map.get(nums[i]).get(1)]);
                
                Collections.sort(oneAns);

                if (!ans.contains(oneAns)){
                ans.add(oneAns);
                }
            }
        }
        
        return ans;
        
    }
}
