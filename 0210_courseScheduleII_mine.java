class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Queue<Integer> queue=new LinkedList<>();
        ArrayList<Integer>[] nexts=new ArrayList[numCourses];
        int[] preNum=new int[numCourses];
        for(int i=0;i<numCourses;i++)
            nexts[i]=new ArrayList();
        for(int i=0;i<prerequisites.length;i++){
            int pre=prerequisites[i][1];
            int next=prerequisites[i][0];
            nexts[pre].add(next);
            preNum[next]++;
        }
        
        for(int i=0;i<numCourses;i++)
            if(preNum[i]==0) 
                queue.offer(i);
             
        
        Queue<Integer> ans=new LinkedList();
        
        while(!queue.isEmpty()){
            int t=queue.poll();
            //System.out.println("location 1:" + t);
            ans.add(t);
            for(int neighbor:nexts[t]){
                preNum[neighbor]--;
                if(preNum[neighbor]==0)
                    queue.offer(neighbor);
            }
        }
        
        for(int i=0;i<numCourses;i++){
            if(preNum[i]!=0)
                return new int[0];
        }
        
        int[] ans2=new int[ans.size()];

        
        for(int i=0;i<ans2.length;i++){
            ans2[i]=ans.poll();
        }
     return ans2;
    }
}
