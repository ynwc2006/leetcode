class Solution {
    public boolean isPerfectSquare(int num) {
        int lo=1,hi=2<<16;
        while(lo<hi){
            int mid=(lo+hi)/2;
            System.out.println(mid);
            if((double)mid*mid==(double)num) return true;
            else if((double)mid*mid>(double)num) hi=mid;
            else lo=mid+1;
        }
        return lo*lo==num;
    }
}
