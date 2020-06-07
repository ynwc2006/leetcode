class Solution {

    int len;
    int[] original;
    int[] array;
    
    Random random= new Random();
    
    public Solution(int[] nums) {
        original=nums;
        array=original.clone();
        len=nums.length;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array=original.clone();
        return array;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=0;i<len;i++){
            int index= RandomInRange(i,len);
            int t=array[i];
            array[i]=array[index];
            array[index]=t;
        }
        return array;
    }
    
    private int RandomInRange(int min, int max){
        return min+random.nextInt(max-min);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
