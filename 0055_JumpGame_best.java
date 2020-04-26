//solution 2 Greedy. O(n)
class Solution {
    public boolean canJump(int[] nums) {
        int leftMost=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=leftMost) leftMost=i;
        }
        if (leftMost==0) return true;
        return false;
}
}


//solution 1 DP O(n2)
enum Index {
    GOOD, BAD, UNKNOWN
}

public class Solution {
    public boolean canJump(int[] nums) {
        Index[] memo = new Index[nums.length];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length - 1] = Index.GOOD;

        for (int i = nums.length - 2; i >= 0; i--) {
            int furthestJump = Math.min(i + nums[i], nums.length - 1);
            for (int j = i + 1; j <= furthestJump; j++) {
                if (memo[j] == Index.GOOD) {
                    memo[i] = Index.GOOD;
                    break;
                }
            }
        }

        return memo[0] == Index.GOOD;
    }
}

