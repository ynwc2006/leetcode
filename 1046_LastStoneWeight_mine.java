class Solution {
    public int lastStoneWeight(int[] stones) {
        int len=stones.length;
        if (stones.length==1) return stones[0];
        while(len>1){
            Arrays.sort(stones);
            stones[len-2]=stones[len-1]-stones[len-2];
            stones[len-1]=Integer.MAX_VALUE;
            len--;
            
        }
        return stones[0];
        
    }
}
