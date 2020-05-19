class StockSpanner {
    int[] dp;
    int[] prices;
    int i;
    
    public StockSpanner() {
        dp=new int[10001];
        dp[0]=Integer.MAX_VALUE;
        prices=new int[10001];
        i=0;
    }
    
    public int next(int price) {
        i++;
        prices[i]=price;
        //if(i==1) return 1;
        if (price<prices[i-1]) {dp[i]=1;return 1;}
        
        int count=1;
        int p=i-1;
        while(p>0 && price>= prices[p]){
            count+=dp[p] ;
            p=p-dp[p];
           // System.out.println(i+","+p);
        }

        dp[i]=count;
        return dp[i];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
