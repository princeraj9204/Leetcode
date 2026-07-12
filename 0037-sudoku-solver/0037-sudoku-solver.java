class Solution {
    public static boolean sudukosolver(char[][] suduko , int row , int col){
        if(row == 9 && col == 0 ){
            return true;
        }
        int nextrow = row;
        int nextcol = col+1;
        if(col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }
        if(suduko[row][col] != '.'){
           return sudukosolver(suduko , nextrow , nextcol);
        }
        for(int digit = 1 ; digit <= 9 ; digit++){
            if(isSafe(suduko , row , col , digit)){
                suduko[row][col] = (char)(digit+'0');
                if(sudukosolver(suduko , nextrow , nextcol)){
                    return true;
                }
                suduko[row][col] = '.';
            }
        }
        return false;
        
    }
    public static boolean isSafe(char[][] suduko , int row , int col , int digit){
        char ch = (char)(digit+'0');
        for(int i=0;i<=8;i++){
            if(suduko[i][col] == ch){
                return false;
            }
        }
        //row
        for(int i=0;i<=8;i++){
            if(suduko[row][i] == ch){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc ; j<sc+3 ; j++){
                if(suduko[i][j] == ch){
                    return false;
                }
            }
        }
        return true;

    }
    public void solveSudoku(char[][] board) {
         sudukosolver(board , 0 , 0);
    
    }
}