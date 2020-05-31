class Solution {
    //Kahn's algorithm
    List<Integer>[] nexts;
    boolean ans;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Queue<Integer> starts=new LinkedList<>();
        nexts= new ArrayList[numCourses];
        int[] preNum=new int[numCourses];
        for (int i = 0; i < numCourses; i++) { 
            nexts[i] = new ArrayList<Integer>(); 
        }
        

        for(int i=0;i<prerequisites.length;i++) {
            int pre=prerequisites[i][1];
            int next= prerequisites[i][0];
            preNum[next]++;
            nexts[pre].add(next);
        }

        for (int i = 0; i < numCourses; i++) { 
            if (preNum[i]==0) starts.offer(i);
        }
        
        while(!starts.isEmpty()){
            int n=starts.poll();
            for(int neighbor:nexts[n]){
                preNum[neighbor]--;
                if(preNum[neighbor]==0) 
                    starts.offer(neighbor);
            }
        }
        
        for (int i = 0; i < numCourses; i++) { 
            if (preNum[i]!=0) return false;
        }
        
        
        
        return true;
    }
    
}
