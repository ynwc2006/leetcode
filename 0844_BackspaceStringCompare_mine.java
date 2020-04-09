class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> sS = new Stack<Character>();
        Stack<Character> sT= new Stack<Character>();
        for(char c: S.toCharArray()){
            if (c=='#') {if (!sS.empty()) sS.pop();}
            else sS.push(c);
        }
        for(char c: T.toCharArray()){
            if (c=='#'){if(!sT.empty()) sT.pop();}
            else sT.push(c);
        }
        
        while (!sS.empty() && !sT.empty()){
            if(sS.pop()!=sT.pop()) return false;
        }
        if((!sS.empty() || !sT.empty())) return false;
        return true;
        
}
}
