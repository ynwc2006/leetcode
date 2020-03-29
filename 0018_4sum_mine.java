class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        int sizeAns=0;
        for(int i=0;i<=nums.length-4;i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<=nums.length-3;j++){
                if (j>i+1 && nums[j]==nums[j-1]) continue;
                int lo=j+1;
                int hi=nums.length-1;
                
                while(lo<hi){
                    if (lo<hi && nums[i]+nums[j]+nums[lo]+nums[hi]-target==0){
                       /* if(sizeAns ==0)
                            {ans.add(Arrays.asList(nums[i],nums[j],nums[lo],nums[hi]));}
                        else {
                            if (Arrays.asList(nums[i],nums[j],nums[lo],nums[hi])!=ans.get(sizeAns-1))
                                {ans.add(Arrays.asList(nums[i],nums[j],nums[lo],nums[hi]));}
                        }*/
                        ans.add(Arrays.asList(nums[i],nums[j],nums[lo],nums[hi]));
                        sizeAns++;
                        lo++;
                        hi--;
                        while(lo<hi && nums[lo]==nums[lo-1]) {lo++;}
                        while(lo<hi && nums[hi]==nums[hi+1]) {hi--;}
                        
                    }
                    else if (nums[i]+nums[j]+nums[lo]+nums[hi]>target){
                        hi--;
                    }
                    else {
                        lo++;
                    }
                }
            }
        }
        
        return ans;
    }
}
