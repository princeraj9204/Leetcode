class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    if(found(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean found(char board[][], String word,int m,int n,int idx){
        if(idx == word.length()){
            return true;
        }
        if(m < 0 || n < 0 || m >= board.length || n>=board[0].length || board[m][n] != word.charAt(idx)){
            return false;
        }
        char ch = board[m][n];
        board[m][n] = '#';
        boolean ans = found(board,word,m-1,n,idx+1)||
                        found(board,word,m+1,n,idx+1) ||
                        found(board,word,m,n-1,idx+1) ||
                        found(board,word,m,n+1,idx+1);
            board[m][n] = ch;
            return ans;
    }
}