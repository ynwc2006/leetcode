class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean ans =true;

        
        for(int i=0;i<9;i+=3)
            for(int j=0;j<9;j+=3){
                ans=ans && checkBox(board,i,j);
                if(!ans) return false;
            }
        
        for(int i=0;i<9;i++){
            ans=ans && checkRow(board,i);
            ans=ans && checkCol(board,i);
        }
        
        return ans;
        
    }
    
    private boolean checkBox(char[][] board,int a,int b){
        HashSet<Character> set= new HashSet<>();
        for(int i=a;i<a+3;i++)
            for(int j=b;j<b+3;j++){
                if (board[i][j]!='.'){
                    if(set.contains(board[i][j])) return false;
                    set.add(board[i][j]);
                    }
                
            }
        return true;    
    }
    
    private boolean checkRow(char[][] board,int row){
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<9;i++)
        {if (board[row][i]!='.'){
            if(set.contains(board[row][i])) return false;
            set.add(board[row][i]);
            }
                
        }
        return true;    
    }
    
    private boolean checkCol(char[][] board,int col){
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<9;i++)
        {if (board[i][col]!='.'){
            if(set.contains(board[i][col])) return false;
            set.add(board[i][col]);
            }
                
        }
        return true;    
    }
    
    
    
}
