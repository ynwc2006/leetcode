class Solution {
    public int mySqrt(int x) {
        if (x==1) return 1;
        int i;
        for(i=1;i<=x;i++){
            if (i*i>x || i*i<0) return i-1;
        }
        return i-1;
    }
}
