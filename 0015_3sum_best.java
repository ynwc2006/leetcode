public List<List<Integer>> threeSum(int[] num) {
    Arrays.sort(num);
    List<List<Integer>> res = new LinkedList<>(); 
    for (int i = 0; i < num.length-2; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
            while (lo < hi) {
                if (num[lo] + num[hi] == sum) {
                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
                    while (lo < hi && num[lo] == num[lo+1]) lo++;
                    while (lo < hi && num[hi] == num[hi-1]) hi--;
                    lo++; hi--;
                } else if (num[lo] + num[hi] < sum) lo++;
                else hi--;
           }
        }
    }
    return res;
}

/* 
//best code in my own words

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int lo=i+1;
            int hi=nums.length-1;
            while(lo<hi){
                if(nums[lo]+nums[hi] == 0-nums[i]){
                    ans.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                    while (lo<hi && nums[lo]==nums[lo+1]) {lo++;}
                    while (lo<hi && nums[hi]==nums[hi-1]) {hi--;}
                    lo++;
                    hi--;
                }
                else if(nums[lo]+nums[hi]<0-nums[i]){
                    lo++;
                }
                else hi--;
            }
        }
 
        return ans;
        
    }
}

*/
