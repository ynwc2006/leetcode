class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map=new int[256];
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            map[c]++;
        }
        int left=0,right=0,count=s1.length();
        while(right<s2.length()){
            char c=s2.charAt(right);
            if(map[c]>0)count--;
            map[c]--;
            right++;
            while(count==0){
                if(right-left==s1.length()) return true;
                char cl=s2.charAt(left);
                if(map[cl]>=0) count++;
                map[cl]++;
                left ++;
            }
        }
        return false;
    }
}
