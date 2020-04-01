class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        for(int i : nums){
            a=a^i;
        }
        return a;
    }
}

//a⊕0=a
//a⊕a=0
