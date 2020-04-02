class Solution {
    public boolean isHappy(int n) {
        int len=0;
        int sum=0;//next
        int temp=n;//current
        Set<Integer> set= new HashSet<>();
        
        while(!set.contains(temp)){
            set.add(temp);
            sum=0;
            while(temp!=0){
                sum+=(temp%10)*(temp%10);
                temp=temp/10;
            }
            temp=sum;
         }
        return sum==1;
    }
}
