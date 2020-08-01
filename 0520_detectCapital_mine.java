class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()<=1) return true;
        if(word.charAt(0)-'a'>=0) { //abc
            for(int i=1;i<word.length();i++){
                char c=word.charAt(i);
                if (c-'a'<0)return false;//aBc
            }
            return true;
        }
        
        if(word.charAt(0)-'a'<0) {//A
            if(word.charAt(1)-'a'>=0){//Abc
                for(int i=2;i<word.length();i++){
                char c=word.charAt(i);
                if (c-'a'<0)return false;//AbC
            }
                return true;
            }
            if(word.charAt(1)-'a'<0){//ABC
                for(int i=2;i<word.length();i++){
                char c=word.charAt(i);
                if (c-'a'>=0)return false;//ABc
            }
                return true;
            }
            
        }
        return true;
            
    }
    
    
}
