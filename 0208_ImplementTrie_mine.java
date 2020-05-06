class Trie {
    private class Node{
        boolean isEnd;
        char val;
        Node[] children;
        Node(boolean e, char c){
            this.val=c;
            isEnd=e;
            children=new Node[26];
        }
        Node(){
            this(false,' ');
        }
        
    }
    /** Initialize your data structure here. */
    Node root;
    public Trie() {
        root=new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        //if (root.val==' ') root.val=word.charAt(0);
        Node p=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(p.children[c-'a']==null) {
                p.children[c-'a']=new Node(false,c);
            }
            p=p.children[c-'a'];     
        }
        p.isEnd=true;
        return;
            
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        //if(root.val!=word.charAt(0)) return false;
        Node p=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(p.children[c-'a']==null) return false;
            p=p.children[c-'a'];
        }
        return p.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String word) {
       // if(root.val!=word.charAt(0)) return false;
        Node p=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(p.children[c-'a']==null) return false;
            p=p.children[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
