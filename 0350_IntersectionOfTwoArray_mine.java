//solution1 O(nlogn,n=max(n1,n2)). Sorting + two pointers
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        if(len1==0 || len2==0) return new int[0];
        int[] ans=new int[Math.min(len1,len2)]; 
        int count=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<len1 && j<len2){
            if(nums1[i]==nums2[j]){
                ans[count]=nums1[i];
                count++;
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        return Arrays.copyOf(ans,count);
    }
}
//solution2  HashMap
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int len1=nums1.length;
        int len2=nums2.length;
        int[] ans=new int[Math.min(len1,len2)];
        int count=0;
        for(int i=0;i<len1;i++){
            if(map.containsKey(nums1[i])) map.put(nums1[i],map.get(nums1[i])+1);
            else map.put(nums1[i],1);
        }
        for(int j=0;j<len2;j++){
            if(map.containsKey(nums2[j])){
                int t=nums2[j];
                ans[count]=t;
                count++;
                if(map.get(t)==1) map.remove(t);
                else map.put(t,map.get(t)-1);  
            }
        }
        return Arrays.copyOf(ans,count);
    }
}
