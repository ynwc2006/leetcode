class Solution {
    public int[][] reconstructQueue(int[][] people) {
      Comparator<int[]> cmp=new Comparator<int[]>(){
          public int compare(int[] a, int[] b){
              return a[0]-b[0];
          }
      };
        Arrays.sort(people,cmp);
        int[][] ans= new int[people.length][2];
        for(int i=0;i<ans.length;i++){
            ans[i][0]=-1;
            ans[i][1]=-1;
        }
        //for(int[] p:people){
        //    System.out.println(p[0]+" "+p[1]);
        //}
        for(int i=0;i<people.length;i++){
            int pos=0;
            int j=0;
          // while(ans[j][0]!=0 ) j++;
            while(pos<=people[i][1]){
                if((ans[j][0]==-1) || (ans[j][0]==people[i][0])) pos++;
                j++;
                
            }
            ans[j-1][0]=people[i][0];
            ans[j-1][1]=people[i][1];
            int p=j-1;
           // System.out.println(p+":"+ans[j-1][0]+" "+ans[j-1][1]);
        }
        return ans;
    }
}
